SUMMARY = "Python bindings for libxkbcommon using cffi"
DESCRIPTION = "Python bindings for libxkbcommon using cffi"
LICENSE = "MIT"

PV = "0.8"

RPM_NAME = "python311-xkbcommon-0.8-1.4.aarch64.rpm"
RPM_HASH = "b39b00f152a026b39518c09a5f7bc68f56388cc47a113c632432dd3889668d0cefeeef4fc6ca12a2e3936650260199b61fb3f5ab14f2d403b8ea95005337660f"

RPROVIDES:${PN} += "python3.11dist(xkbcommon) \
python311-xkbcommon \
python311-xkbcommon(aarch-64) \
python3dist(xkbcommon)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libxkbcommon.so.0()(64bit) \
python(abi)"

inherit rpm
