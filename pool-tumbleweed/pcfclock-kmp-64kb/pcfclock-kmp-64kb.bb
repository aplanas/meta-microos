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

RPM_NAME = "pcfclock-kmp-64kb-0.44_k6.4.3_1-269.34.aarch64.rpm"
RPM_HASH = "661bacb1cc1417155e65e60a9ac5430d7959cf0aefbaa51247d01b9bccb244b633d4b34033f8f3eb9bfbe47ca65b6ccff42d572ae1d49919b0586ab79475fb15"

RPROVIDES:${PN} += "kmod-pcfclock.ko \
multiversion-kernel \
pcfclock-kmp \
pcfclock-kmp-64kb \
pcfclock-kmp-64kb-k6.4.3-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
