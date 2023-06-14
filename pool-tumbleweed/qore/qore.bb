SUMMARY = "Multithreaded Programming Language"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic. \
It applies a scripting-based approach to interface development and \
can also be used as a general purpose language."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "1.13.0"

RPM_NAME = "qore-1.13.0-1.4.aarch64.rpm"
RPM_HASH = "43d51992fae6009d8cd400202aba7fdc505d0d6828296f392a0301b940eeea14613ed92119a1719647d42a69305bf91b1ff22c4dae537d31c8ae7dccf4ca277e"

RPROVIDES:${PN} += "qore"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqore.so.12 \
libstdc++.so.6 \
shared-mime-info"

inherit rpm
