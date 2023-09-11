SUMMARY = "Dynamic Time Warping (DTW) package"
DESCRIPTION = "Library for time series distances (e.g. Dynamic Time Warping, DTW)."
LICENSE = "Apache-2.0"

PV = "2.3.10"

RPM_NAME = "python311-dtaidistance-2.3.10-3.1.aarch64.rpm"
RPM_HASH = "71516b747fb34d212ca9d01651868dec618eb911366cc6b1cb85eee319f6e8935d5b656803b31472e8e880f9997f128363bf1d90d54e0648c089a0b19075e9cc"

RPROVIDES:${PN} += "python3-dtaidistance \
python3.11dist-dtaidistance \
python311-dtaidistance \
python3dist-dtaidistance"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
python-abi"

inherit rpm
