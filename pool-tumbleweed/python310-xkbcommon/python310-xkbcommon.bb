SUMMARY = "Python bindings for libxkbcommon using cffi"
DESCRIPTION = "Python bindings for libxkbcommon using cffi"
LICENSE = "MIT"

PV = "0.8"

RPM_NAME = "python310-xkbcommon-0.8-1.6.aarch64.rpm"
RPM_HASH = "dc0543be0087d7715494c0de9a5594af0989bb8189b4009acf85b978f5cfbfa8f37bcb226d28aca7f3d2e4a49019ea8257abf7ff57920dd6fefd62fde58fe468"

RPROVIDES:${PN} += "python3.10dist-xkbcommon \
python310-xkbcommon \
python3dist-xkbcommon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxkbcommon.so.0 \
python-abi"

inherit rpm
