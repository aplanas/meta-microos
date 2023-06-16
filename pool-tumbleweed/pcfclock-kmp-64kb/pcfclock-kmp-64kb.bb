SUMMARY = "Pcfclock kernel driver"
DESCRIPTION = "The pcfclock(4) driver for GNU/Linux supports the parallel port radio \
clock sold by Conrad Electronic under order number 967602. The radio \
clock, which is put between your parallel port and your printer, \
receives the legal German time, i.e. CET or CEST, from the DCF77 \
transmitter and uses it to set its internal quartz clock. The DCF77 \
transmitter is located near to Frankfurt/Main and covers a radius of \
more than 1500 kilometers."
LICENSE = "GPL-2.0-or-later"

PV = "0.44_k6.3.4_1"

RPM_NAME = "pcfclock-kmp-64kb-0.44_k6.3.4_1-269.26.aarch64.rpm"
RPM_HASH = "f2d38ef15d706125f513ee64db03a0ad6f54d64e0cc03b8bbed00371725c0c56d4e6d3c547326d45b810267f52a7912da041926d9935d04f69b8f1acf49cc40e"

RPROVIDES:${PN} += "kmod-pcfclock.ko \
multiversion-kernel \
pcfclock-kmp \
pcfclock-kmp-64kb \
pcfclock-kmp-64kb-k6.3.4-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
