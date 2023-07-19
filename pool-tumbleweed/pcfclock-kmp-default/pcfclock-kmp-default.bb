SUMMARY = "Pcfclock kernel driver"
DESCRIPTION = "The pcfclock(4) driver for GNU/Linux supports the parallel port radio \
clock sold by Conrad Electronic under order number 967602. The radio \
clock, which is put between your parallel port and your printer, \
receives the legal German time, i.e. CET or CEST, from the DCF77 \
transmitter and uses it to set its internal quartz clock. The DCF77 \
transmitter is located near to Frankfurt/Main and covers a radius of \
more than 1500 kilometers."
LICENSE = "GPL-2.0-or-later"

PV = "0.44_k6.4.3_1"

RPM_NAME = "pcfclock-kmp-default-0.44_k6.4.3_1-269.34.aarch64.rpm"
RPM_HASH = "3056e9dd564b9dd4831c8d1a63899a81a981ff948d9506e1700b501a75460a636485f99608184474d39617457e2fa3125260e81002fe32a1ea490d0264aa1b32"

RPROVIDES:${PN} += "kmod-pcfclock.ko \
multiversion-kernel \
pcfclock-kmp \
pcfclock-kmp-default \
pcfclock-kmp-default-k6.4.3-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
