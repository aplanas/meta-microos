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

RPM_NAME = "pcfclock-kmp-default-0.44_k6.4.2_1-269.33.aarch64.rpm"
RPM_HASH = "083e137b099c0c98a893db022089dbb81b4e0ffc2f2703879084618657b93298ef6be9c22b28a63f4cd178805412d6f4c34dba991d5017292c50534699dd4332"

RPROVIDES:${PN} += "kmod-pcfclock.ko \
multiversion-kernel \
pcfclock-kmp \
pcfclock-kmp-default \
pcfclock-kmp-default-k6.4.2-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
