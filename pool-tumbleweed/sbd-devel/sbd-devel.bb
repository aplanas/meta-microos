SUMMARY = "Storage-based death environment for regression tests"
DESCRIPTION = "This package provides an environment + testscripts for \
regression-testing sbd."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.1+20221128.8ec8e01"

RPM_NAME = "sbd-devel-1.5.1+20221128.8ec8e01-1.3.aarch64.rpm"
RPM_HASH = "99eeb4c42c09890dd39e6ea436e44f0046488c058a5fe8fbdc33c4d5a0d6164c60cbc78131df46bbf027e48dad9b1d4d69a26209847787cddda57f6f87f2b1e6"

RPROVIDES:${PN} += "libsbdtestbed.so.0()(64bit) \
sbd-devel \
sbd-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
sbd"

inherit rpm