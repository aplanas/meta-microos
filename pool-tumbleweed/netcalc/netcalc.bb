SUMMARY = "IP subnet calculator"
DESCRIPTION = "netcalc is an IP network calculator that can calcuate host IP ranges, subnet \
masks, and split networks. It is a clone of sipcalc and uses the output format \
of ipcalc."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "netcalc-2.1.6-2.8.aarch64.rpm"
RPM_HASH = "5dfe2a77933d53ba90c7a4b86fdc05c02e83696fbec8a8d8e5fc77e713fe955fc5f39619830462c5a245e79e368ffbd1bb74f42c3c75ea21fec008a367b6e46b"

RPROVIDES:${PN} += "netcalc \
netcalc(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
