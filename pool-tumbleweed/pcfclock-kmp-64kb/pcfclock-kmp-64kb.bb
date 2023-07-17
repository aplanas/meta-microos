SUMMARY = "Pcfclock kernel driver"
DESCRIPTION = "The pcfclock(4) driver for GNU/Linux supports the parallel port radio \
clock sold by Conrad Electronic under order number 967602. The radio \
clock, which is put between your parallel port and your printer, \
receives the legal German time, i.e. CET or CEST, from the DCF77 \
transmitter and uses it to set its internal quartz clock. The DCF77 \
transmitter is located near to Frankfurt/Main and covers a radius of \
more than 1500 kilometers."
LICENSE = "GPL-2.0-or-later"

PV = "0.44_k6.4.2_1"

RPM_NAME = "pcfclock-kmp-64kb-0.44_k6.4.2_1-269.33.aarch64.rpm"
RPM_HASH = "4f97b0b9c05335c6bcb0dd60fe43500dd206738d3930272673e7280c77923164d8d26bc72f7e3e071055798634179747695d49e9cc2d7785de408857b498c738"

RPROVIDES:${PN} += "kmod-pcfclock.ko \
multiversion-kernel \
pcfclock-kmp \
pcfclock-kmp-64kb \
pcfclock-kmp-64kb-k6.4.2-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
