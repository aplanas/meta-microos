SUMMARY = "Library for Decoding and Generating MPEG TS and DVB PSI Tables"
DESCRIPTION = "libdvbpsi is a simple library designed for decoding and generating \
MPEG TS and DVB PSI tables. Current features: * Program Association Table \
(PAT), decoder and generator."
LICENSE = "LGPL-2.1+"

PV = "1.3.3"

RPM_NAME = "libdvbpsi10-1.3.3-1.12.aarch64.rpm"
RPM_HASH = "0e2de561ce86792efd57ae9869f2e414d936655875a0241ed5eb0ae61945bbaf959ba5f7c2f63aec9841bb0e060e9423499d2e7d07194cc9fc25391636195089"

RPROVIDES:${PN} += "libdvbpsi.so.10()(64bit) \
libdvbpsi10 \
libdvbpsi10(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
