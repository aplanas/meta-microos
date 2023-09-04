SUMMARY = "Devhelp plugin for the valadoc generator"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.12"

RPM_NAME = "valadoc-doclet-devhelp-0.56.12-1.1.aarch64.rpm"
RPM_HASH = "daa813520c2a7c5cda68b7112096cc742335cc4eb89ecf06d4286b9cba9c51782b05e273860ffb00ba7687ad00a3d55c83ac792e818126bbdb2c89d355e2244a"

RPROVIDES:${PN} += "libdoclet.so \
valadoc-doclet-devhelp"

RDEPENDS:${PN} += "libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvala-0.56.so.0 \
libvaladoc-0.56.so.0"

inherit rpm
