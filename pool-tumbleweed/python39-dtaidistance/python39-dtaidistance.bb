SUMMARY = "Dynamic Time Warping (DTW) package"
DESCRIPTION = "Library for time series distances (e.g. Dynamic Time Warping, DTW)."
LICENSE = "Apache-2.0"

PV = "2.3.10"

RPM_NAME = "python39-dtaidistance-2.3.10-3.1.aarch64.rpm"
RPM_HASH = "b47da44f5d358920ac3e66f6a1ff3eca062595ba41bbeb4693a4c24dfb59500b7a9c693f37097bb191f64752fd2b8f61d33d8c82dfc456f438f598f95469b6b2"

RPROVIDES:${PN} += "python3.9dist-dtaidistance \
python39-dtaidistance \
python3dist-dtaidistance"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
python-abi"

inherit rpm
