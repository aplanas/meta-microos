SUMMARY = "Utilities for AV/C 1394"
DESCRIPTION = "Command-line utilities to inspect and control AV/C hardware."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.4"

RPM_NAME = "libavc1394-tools-0.5.4-19.14.aarch64.rpm"
RPM_HASH = "c7248e6901c8e0fad0fb836c6c4305237832d842782948fddf39a3894898d1d449ed2d7777c682fc746b182aaf6bace7bd2c6ed6742e2bf449bac8067450e7d7"

RPROVIDES:${PN} += "libavc1394 \
libavc1394-tools \
libavc1394-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libavc1394.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libraw1394.so.11()(64bit) \
librom1394.so.0()(64bit)"

inherit rpm
