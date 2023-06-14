SUMMARY = "Dynamic Time Warping (DTW) package"
DESCRIPTION = "Library for time series distances (e.g. Dynamic Time Warping, DTW)."
LICENSE = "Apache-2.0"

PV = "2.3.10"

RPM_NAME = "python39-dtaidistance-2.3.10-2.4.aarch64.rpm"
RPM_HASH = "9f8d25aa004608a9eef7b3466c42a15b304a5f0b55fc7dd20c8d6a9ddbb2947ffdf3e78d197e46ac66f59ab18088fb4917bde6f1aa6ccd691d1792646f542566"

RPROVIDES:${PN} += "python3.9dist-dtaidistance \
python39-dtaidistance \
python3dist-dtaidistance"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
python-abi"

inherit rpm
