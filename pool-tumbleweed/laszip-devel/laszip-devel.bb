SUMMARY = "Development files for laszip"
DESCRIPTION = "Headers and development files for laszip needed to develop \
softwares that handle LAS data to read and write LASzip-compressed \
data."
LICENSE = "LGPL-2.1-or-later"

PV = "3.4.3"

RPM_NAME = "laszip-devel-3.4.3-1.13.aarch64.rpm"
RPM_HASH = "21a8b336b4d9238feef73952f06debb753284afac70375683ba15f5952b854c91ae13e9887c468175403c974d1c32e736e8e6495f8f96b3b0afb559d5820b570"

RPROVIDES:${PN} += "laszip-devel \
laszip-devel(aarch-64)"

RDEPENDS:${PN} += "liblaszip8 \
liblaszip_api8"

inherit rpm
