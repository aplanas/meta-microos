SUMMARY = "Library for assisting in Vouch By Refence functions"
DESCRIPTION = "This package provides the shared library libvbr which \
assists in Vouch By Refence functions."
LICENSE = "BSD-3-Clause & Sendmail"

PV = "2.11.0"

RPM_NAME = "libvbr2-2.11.0-7.15.aarch64.rpm"
RPM_HASH = "4fb3aa630f184d4cfc39fad7819f75c38aea270615dd6a271305457a94fce9b5912f89ac2165b0e638bc4221af1d62488c4dfc8d223c4f58eaae045cefdc6ccb"

RPROVIDES:${PN} += "libvbr.so.2()(64bit) \
libvbr2 \
libvbr2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
