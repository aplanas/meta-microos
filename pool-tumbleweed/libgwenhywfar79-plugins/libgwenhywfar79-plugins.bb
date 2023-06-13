SUMMARY = "Plugins for the gwenhywfar multi-platform helper library"
DESCRIPTION = "Gwenhywfar is a base library used to provide OS abstraction functions \
for Linux, FreeBSD, OpenBSD, NetBSD, and Windows. It also includes \
some often needed functions (for example, for handling and parsing of \
configuration files, reading and writing of XML files, and interprocess \
communication)."
LICENSE = "LGPL-2.1-or-later"

PV = "5.10.1"

RPM_NAME = "libgwenhywfar79-plugins-5.10.1-1.4.aarch64.rpm"
RPM_HASH = "a1d8ffb2197eadab6f010772e41162ceb463ca987b5695419838fbdf06736b3202f466cb927d7eca67ac90256aa1e98731693d16f0be8dff7b1cfc1ad3b56b20"

RPROVIDES:${PN} += "libgwenhywfar79-plugins \
libgwenhywfar79-plugins(aarch-64)"

RDEPENDS:${PN} += "gwenhywfar \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgwenhywfar.so.79()(64bit)"

inherit rpm
