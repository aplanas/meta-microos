SUMMARY = "Devhelp plugin for the valadoc generator"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.13"

RPM_NAME = "valadoc-doclet-devhelp-0.56.13-1.1.aarch64.rpm"
RPM_HASH = "d3fe01ca0f3b2f7132d7217880b86c6b2cb9f76ef9afbdea7cca6cc75dc89c119adae3cdb865c9c6083afcab2af4eeb60910d74fa73c96c5b104df9ec5a13cc3"

RPROVIDES:${PN} += "libdoclet.so \
valadoc-doclet-devhelp"

RDEPENDS:${PN} += "libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvala-0.56.so.0 \
libvaladoc-0.56.so.0"

inherit rpm
