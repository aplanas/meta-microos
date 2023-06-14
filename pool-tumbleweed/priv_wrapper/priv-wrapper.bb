SUMMARY = "A library to disable resource limits and other privilege dropping"
DESCRIPTION = "priv_wrapper aims to help running processes which are dropping privileges or are \
restricting resources in test environments. \
It can disable chroot, prctl, pledge and setrlmit system calls. A disabled call always \
succeeds (i.e. returns 0) and does nothing. \
The system call pledge exists only on OpenBSD. \
 \
To use it, set the following environment variables: \
 \
LD_PRELOAD=libpriv_wrapper.so \
PRIV_WRAPPER_CHROOT_DISABLE=1 \
 \
This package does not have a devel package, because this project is for \
development/testing."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.1"

RPM_NAME = "priv_wrapper-1.0.1-3.2.aarch64.rpm"
RPM_HASH = "e864240ae7632de632be25512ebd9d1fe2fcfb78d07cdeefdf6bea8ff170d83b04a875626426328dfe423f4de5ddd6cd516b1c4a99ce62d18dcbba2c2e34f3ce"

RPROVIDES:${PN} += "cmake-priv-wrapper \
libpriv-wrapper.so.0 \
pkgconfig-priv-wrapper \
priv-wrapper"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
