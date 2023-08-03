SUMMARY = "Pcfclock kernel driver"
DESCRIPTION = "The pcfclock(4) driver for GNU/Linux supports the parallel port radio \
clock sold by Conrad Electronic under order number 967602. The radio \
clock, which is put between your parallel port and your printer, \
receives the legal German time, i.e. CET or CEST, from the DCF77 \
transmitter and uses it to set its internal quartz clock. The DCF77 \
transmitter is located near to Frankfurt/Main and covers a radius of \
more than 1500 kilometers."
LICENSE = "GPL-2.0-or-later"

PV = "0.44_k6.4.6_1"

RPM_NAME = "pcfclock-kmp-64kb-0.44_k6.4.6_1-269.36.aarch64.rpm"
RPM_HASH = "37e42645afc4c7cc87bc57d2c260ea24a6b433f6c6d9211caf01da8dd228886465986b622bb80ed51c699b220b8a83ef64fd8e576220f61aef256f3615095e89"

RPROVIDES:${PN} += "kmod-pcfclock.ko \
multiversion-kernel \
pcfclock-kmp \
pcfclock-kmp-64kb \
pcfclock-kmp-64kb-k6.4.6-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
