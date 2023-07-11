SUMMARY = "Dynamic Time Warping (DTW) package"
DESCRIPTION = "Library for time series distances (e.g. Dynamic Time Warping, DTW)."
LICENSE = "Apache-2.0"

PV = "2.3.10"

RPM_NAME = "python310-dtaidistance-2.3.10-2.6.aarch64.rpm"
RPM_HASH = "6f3dc4d46d3d1b5a4115ba6565eae88f75f5bbb3acc39300cacc84fa23eb9fd8f27b7e851fadd780e66dd2bde04b36e65616a2ef46210ebe7bd94b93c007159a"

RPROVIDES:${PN} += "python3.10dist-dtaidistance \
python310-dtaidistance \
python3dist-dtaidistance"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
python-abi"

inherit rpm
