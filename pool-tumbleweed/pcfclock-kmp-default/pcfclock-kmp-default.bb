SUMMARY = "Pcfclock kernel driver"
DESCRIPTION = "The pcfclock(4) driver for GNU/Linux supports the parallel port radio \
clock sold by Conrad Electronic under order number 967602. The radio \
clock, which is put between your parallel port and your printer, \
receives the legal German time, i.e. CET or CEST, from the DCF77 \
transmitter and uses it to set its internal quartz clock. The DCF77 \
transmitter is located near to Frankfurt/Main and covers a radius of \
more than 1500 kilometers."
LICENSE = "GPL-2.0-or-later"

PV = "0.44_k6.3.9_1"

RPM_NAME = "pcfclock-kmp-default-0.44_k6.3.9_1-269.32.aarch64.rpm"
RPM_HASH = "2232126b7eca3d002352120d05c734937bda2c085a0d1a20e723ca2cb7a5d49c1e5ffae8f4ce8ffe28fe340fd84db8b93572e58a4b201a67d482ce3a379feabd"

RPROVIDES:${PN} += "kmod-pcfclock.ko \
multiversion-kernel \
pcfclock-kmp \
pcfclock-kmp-default \
pcfclock-kmp-default-k6.3.9-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
