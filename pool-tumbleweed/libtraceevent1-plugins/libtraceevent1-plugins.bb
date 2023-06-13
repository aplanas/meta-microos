SUMMARY = "Plugins for the Linux kernel trace event library"
DESCRIPTION = "This package provides plugins for the libtraceevent library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.7.2"

RPM_NAME = "libtraceevent1-plugins-1.7.2-1.1.aarch64.rpm"
RPM_HASH = "a7b3abd27e4ccde5dc41cf5f2bb6398930060e4bcf67a38aa4fdd6f8c62c75c76ffd9c0bede9ec77ddd49aab7113d0a4839bce0caab7f805328de2f645d4ef57"

RPROVIDES:${PN} += "libtraceevent1-plugins \
libtraceevent1-plugins(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libtraceevent.so.1()(64bit) \
libtraceevent1"

inherit rpm
