SUMMARY = "Dynamic Time Warping (DTW) package"
DESCRIPTION = "Library for time series distances (e.g. Dynamic Time Warping, DTW)."
LICENSE = "Apache-2.0"

PV = "2.3.10"

RPM_NAME = "python310-dtaidistance-2.3.10-2.4.aarch64.rpm"
RPM_HASH = "a82bbdc511634c83b9b9727d8bf6be93c2da543530487ec62be9d2686baf7486ec690aa5898f0b2b3f0812590872ea0032fdf1b8cb20700c26a116dd548b2d2f"

RPROVIDES:${PN} += "python3-dtaidistance \
python3.10dist(dtaidistance) \
python310-dtaidistance \
python310-dtaidistance(aarch-64) \
python3dist(dtaidistance)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgomp.so.1()(64bit) \
python(abi)"

inherit rpm
