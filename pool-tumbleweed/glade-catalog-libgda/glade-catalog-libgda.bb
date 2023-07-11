SUMMARY = "Glade catalog for libgda"
DESCRIPTION = "This package provides a catalog for Glade, to allow the use the libgda \
widgets in Glade."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "glade-catalog-libgda-6.0.0-6.8.aarch64.rpm"
RPM_HASH = "fd8387d2efb9a4541e5476edac9b887c216282eb44a67f8a88b6bb6e37812ce6c239053ea89b4e71dbba43fb3054308c9ddbb0c3e681b639497a23f882aa9bde"

RPROVIDES:${PN} += "glade-catalog-libgda"

RDEPENDS:${PN} += "glade \
libgda-6-0"

inherit rpm
