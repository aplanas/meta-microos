SUMMARY = "Devhelp plugin for the valadoc generator"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.8"

RPM_NAME = "valadoc-doclet-devhelp-0.56.8-1.1.aarch64.rpm"
RPM_HASH = "7502b8d83714bdf7e707fb04cd703ed29c10d2d17df8d334182f41ec67d23f177e73de89b711657d70eaae7832de2da5ce420f1461982804a0c4208fd2e1a9d7"

RPROVIDES:${PN} += "libdoclet.so()(64bit) \
valadoc-doclet-devhelp \
valadoc-doclet-devhelp(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libvala-0.56.so.0()(64bit) \
libvaladoc-0.56.so.0()(64bit)"

inherit rpm
