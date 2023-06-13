SUMMARY = "Daemon for feeding entropy into the random pool"
DESCRIPTION = "The haveged daemon feeds the Linux entropy pool with random \
numbers generated from hidden processor state. \
 \
For more information, see http://www.issihosts.com/haveged/ ."
LICENSE = "GPL-3.0-only"

PV = "1.9.18"

RPM_NAME = "haveged-1.9.18-2.3.aarch64.rpm"
RPM_HASH = "22eab4de3c507f90f1265360e9cefa7caef232663bd19261cd098dad5ac2b97c403c193aaab44e7c899e222be9f2d8b75814a5aeb2f7fc9a4468002df6bfc597"

RPROVIDES:${PN} += "haveged \
haveged(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
coreutils \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libhavege.so.2()(64bit) \
systemd"

inherit rpm
