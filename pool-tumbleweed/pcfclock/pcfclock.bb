SUMMARY = "Pcfclock kernel driver"
DESCRIPTION = "The pcfclock(4) driver for GNU/Linux supports the parallel port radio \
clock sold by Conrad Electronic under order number 967602. The radio \
clock, which is put between your parallel port and your printer, \
receives the legal German time, i.e. CET or CEST, from the DCF77 \
transmitter and uses it to set its internal quartz clock. The DCF77 \
transmitter is located near to Frankfurt/Main and covers a radius of \
more than 1500 kilometers."
LICENSE = "GPL-2.0-or-later"

PV = "0.44"

RPM_NAME = "pcfclock-0.44-269.33.aarch64.rpm"
RPM_HASH = "fc217a2334d06d240f4e8f811572ddc046620dc8c7884cb2253aa5b827413e010d406e0e2b950c60314b8ab6ddc19b4269c8dccf3e2aabf065ea4719d568076e"

RPROVIDES:${PN} += "pcfclock"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
pcfclock-kmp \
systemd"

inherit rpm
