SUMMARY = "Pcfclock kernel driver"
DESCRIPTION = "The pcfclock(4) driver for GNU/Linux supports the parallel port radio \
clock sold by Conrad Electronic under order number 967602. The radio \
clock, which is put between your parallel port and your printer, \
receives the legal German time, i.e. CET or CEST, from the DCF77 \
transmitter and uses it to set its internal quartz clock. The DCF77 \
transmitter is located near to Frankfurt/Main and covers a radius of \
more than 1500 kilometers."
LICENSE = "GPL-2.0-or-later"

PV = "0.44_k6.4.11_1"

RPM_NAME = "pcfclock-kmp-default-0.44_k6.4.11_1-269.39.aarch64.rpm"
RPM_HASH = "064dca06f8536834bc0d1178965a73f280f71aa1f0c76850bda62dcae8b2072421da96031daebb03276946953cb4ffa77c843d347cb8e275095ca549e4663ff2"

RPROVIDES:${PN} += "kmod-pcfclock.ko \
multiversion-kernel \
pcfclock-kmp \
pcfclock-kmp-default \
pcfclock-kmp-default-k6.4.11-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
