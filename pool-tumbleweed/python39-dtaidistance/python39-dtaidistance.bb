SUMMARY = "Dynamic Time Warping (DTW) package"
DESCRIPTION = "Library for time series distances (e.g. Dynamic Time Warping, DTW)."
LICENSE = "Apache-2.0"

PV = "2.3.10"

RPM_NAME = "python39-dtaidistance-2.3.10-2.6.aarch64.rpm"
RPM_HASH = "45d4b53049a1e0f906040564b132bd8f9bdaebf7e855d80b906e161eaad06381a187d5a36d2eae3b4d9ad3170061799696d5a0c7ee060c8a379856d89efc8fcd"

RPROVIDES:${PN} += "python3.9dist-dtaidistance \
python39-dtaidistance \
python3dist-dtaidistance"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
python-abi"

inherit rpm
