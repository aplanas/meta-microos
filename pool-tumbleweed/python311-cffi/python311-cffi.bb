SUMMARY = "Foreign Function Interface for Python calling C code"
DESCRIPTION = "Foreign Function Interface for Python calling C code. The aim of this project \
is to provide a convenient and reliable way of calling C code from Python."
LICENSE = "MIT"

PV = "1.15.1"

RPM_NAME = "python311-cffi-1.15.1-4.1.aarch64.rpm"
RPM_HASH = "4c24a24ea643611ba62e92e51a1608f8acf864f9d7d48056a2fd7e7ed5c7a01ddcdd4c63775dfa1602fcdd037558c7c3295d04933530f98a359fdd0c45d82482"

RPROVIDES:${PN} += "python3.11dist(cffi) \
python311-cffi \
python311-cffi(aarch-64) \
python3dist(cffi)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libffi.so.8()(64bit) \
libffi.so.8(LIBFFI_BASE_8.0)(64bit) \
libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) \
python(abi) \
python311-pycparser"

inherit rpm
