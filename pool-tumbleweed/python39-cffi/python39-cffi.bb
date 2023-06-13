SUMMARY = "Foreign Function Interface for Python calling C code"
DESCRIPTION = "Foreign Function Interface for Python calling C code. The aim of this project \
is to provide a convenient and reliable way of calling C code from Python."
LICENSE = "MIT"

PV = "1.15.1"

RPM_NAME = "python39-cffi-1.15.1-4.1.aarch64.rpm"
RPM_HASH = "9f834345efa345d9b3a1d248ea23e6b15f6dc92f3158333b6f43da9caedffb596a4e61a86652ba760ecd788ff47179c2e0d3b1b9336ce1c67a2d01b5817a3355"

RPROVIDES:${PN} += "python3.9dist(cffi) \
python39-cffi \
python39-cffi(aarch-64) \
python3dist(cffi)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libffi.so.8()(64bit) \
libffi.so.8(LIBFFI_BASE_8.0)(64bit) \
libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) \
python(abi) \
python39-pycparser"

inherit rpm
