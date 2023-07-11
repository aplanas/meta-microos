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

RPM_NAME = "pcfclock-0.44-269.32.aarch64.rpm"
RPM_HASH = "5a1f3404b25295bf1d45f84a1105c6fefda681fa77f749bcfcf97fe2804158d27af93330ed66ecb89a614e650c6b79496791cedacbefabe4ef44b38b11c2d6b0"

RPROVIDES:${PN} += "pcfclock"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
pcfclock-kmp \
systemd"

inherit rpm
