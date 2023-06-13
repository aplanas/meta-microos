SUMMARY = "Tool for scanning DVB transponders"
DESCRIPTION = "w_scan is a small command line utility used to perform frequency scans for \
DVB and ATSC transmissions. It is capable of creating channels.conf files \
(in different output formats !) as well as initial tuning data for scan. \
It's based on the utility scan from linuxtv-dvb-apps, but meanwhile it was \
heavily changed and has different features."
LICENSE = "GPL-2.0-only"

PV = "20170107"

RPM_NAME = "w_scan-20170107-2.12.aarch64.rpm"
RPM_HASH = "42561e6917f0954584d4c6e97e106c999697052a46dad8cf4367f1eaaeeda64bf9f08afe9ab3bde546b31a70937f3f3d895d6b3c1694cc48d2be3ebe298773ba"

RPROVIDES:${PN} += "w_scan \
w_scan(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
