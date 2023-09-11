SUMMARY = "Dynamic Time Warping (DTW) package"
DESCRIPTION = "Library for time series distances (e.g. Dynamic Time Warping, DTW)."
LICENSE = "Apache-2.0"

PV = "2.3.10"

RPM_NAME = "python310-dtaidistance-2.3.10-3.1.aarch64.rpm"
RPM_HASH = "2369288a37931bef2c04a608658de523ebeaf7d468291da70ee27cb3db83955a4558a1330d7abcab0e26a16132eb48a6086f449f94e3f3d66d7ef7fdef744055"

RPROVIDES:${PN} += "python3.10dist-dtaidistance \
python310-dtaidistance \
python3dist-dtaidistance"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
python-abi"

inherit rpm
