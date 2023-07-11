SUMMARY = "Prompt dialog for gcr"
DESCRIPTION = "This package provides the prompt dialog needed by libgcr."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "gcr3-prompter-3.41.0-3.4.aarch64.rpm"
RPM_HASH = "9158b6d284f35e59534f46eab7eeb7b3d6f3b288c243a24d18083286cde709f572abb176d28304d499eb81740d746cb98bef68c9b4be10bc923eae62379eeae1"

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
