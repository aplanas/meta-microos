SUMMARY = "Multithreaded Programming Language"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic. \
It applies a scripting-based approach to interface development and \
can also be used as a general purpose language."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "1.13.0"

RPM_NAME = "qore-1.13.0-1.6.aarch64.rpm"
RPM_HASH = "1fc00ca118a9d16bec9664c3e333e0738898d33a3b5bbc75b0d72d720b1c7db580d6bff99ae2fa4141d0a31438efa74250b6b53c7386d0602e2351b3d0c66f41"

RPROVIDES:${PN} += "qore"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqore.so.12 \
libstdc++.so.6 \
shared-mime-info"

inherit rpm
