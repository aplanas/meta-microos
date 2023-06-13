SUMMARY = "Python bindings for libxkbcommon using cffi"
DESCRIPTION = "Python bindings for libxkbcommon using cffi"
LICENSE = "MIT"

PV = "0.8"

RPM_NAME = "python39-xkbcommon-0.8-1.4.aarch64.rpm"
RPM_HASH = "012bdc8675dfd67765999e8aa348cb2a38ade837f0e3c81c90f78c2cbb7b0d43c7b621babd22ff3b979a7313becf7be2f55331e8e9d5a50bfe55291cec0b3145"

RPROVIDES:${PN} += "python3.9dist(xkbcommon) \
python39-xkbcommon \
python39-xkbcommon(aarch-64) \
python3dist(xkbcommon)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libxkbcommon.so.0()(64bit) \
python(abi)"

inherit rpm
