SUMMARY = "Dynamic Time Warping (DTW) package"
DESCRIPTION = "Library for time series distances (e.g. Dynamic Time Warping, DTW)."
LICENSE = "Apache-2.0"

PV = "2.3.10"

RPM_NAME = "python311-dtaidistance-2.3.10-2.4.aarch64.rpm"
RPM_HASH = "2c91a72382306444788b8d419d3c40ed10f1c814d07fe8057165d6da669913d15014caf5a19009170ba28b7b14350709e18c0eda76cd05404ba8c007a85b80a3"

RPROVIDES:${PN} += "python3.11dist-dtaidistance \
python311-dtaidistance \
python3dist-dtaidistance"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
python-abi"

inherit rpm
