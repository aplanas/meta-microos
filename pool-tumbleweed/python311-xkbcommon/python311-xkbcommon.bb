SUMMARY = "Python bindings for libxkbcommon using cffi"
DESCRIPTION = "Python bindings for libxkbcommon using cffi"
LICENSE = "MIT"

PV = "0.8"

RPM_NAME = "python311-xkbcommon-0.8-1.6.aarch64.rpm"
RPM_HASH = "eb7745cfb1373acfc6a83b0f68947ee6b3473f348beff7061d7d004f110a427625c358c3adc58728ab90164ec241794c6658dc7d2ed64d22dc814a5738b7fbce"

RPROVIDES:${PN} += "python3-xkbcommon \
python3.11dist-xkbcommon \
python311-xkbcommon \
python3dist-xkbcommon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxkbcommon.so.0 \
python-abi"

inherit rpm
