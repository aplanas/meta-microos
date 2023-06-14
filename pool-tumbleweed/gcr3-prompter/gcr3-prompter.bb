SUMMARY = "Prompt dialog for gcr"
DESCRIPTION = "This package provides the prompt dialog needed by libgcr."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "gcr3-prompter-3.41.0-3.3.aarch64.rpm"
RPM_HASH = "2f4ce5d03db589d9e01e9b63cdfed25d900e724240849dace6dc4125a651135817d1669ac3b04894f2a4ad074d4c9971428b1948a05db8d840609f3eb5ebc5ef"

RPROVIDES:${PN} += "gcr-prompter \
gcr3-prompter"

RDEPENDS:${PN} += "libc.so.6 \
libgcr-base-3.so.1 \
libgcr-ui-3.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
