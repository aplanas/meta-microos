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

RPM_NAME = "pcfclock-kmp-64kb-0.44_k6.4.11_1-269.39.aarch64.rpm"
RPM_HASH = "e031d230924cb8875a266dfe0aeddb7b694600aeaa7dc89f0ea3ddb6fcb18b20b5709d5e57912e882087231dc3cfa8c95d8f3cdd13dde77cf9a66adcb11ab860"

RPROVIDES:${PN} += "kmod-pcfclock.ko \
multiversion-kernel \
pcfclock-kmp \
pcfclock-kmp-64kb \
pcfclock-kmp-64kb-k6.4.11-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
