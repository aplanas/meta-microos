SUMMARY = "Python CFFI bindings to the Brotli library"
DESCRIPTION = "Python CFFI bindings to the Brotli library"
LICENSE = "MIT"

PV = "1.0.9.2"

RPM_NAME = "python39-brotlicffi-1.0.9.2-1.11.aarch64.rpm"
RPM_HASH = "726f7e8af02727cd5daea1c3cda3e047c395f9cd9c815efa1d22bbff5412f7e394860db2915d6aa358e14741bd3d16e300f89889dcd043408cacf1a939ffbc39"

RPROVIDES:${PN} += "python3.9dist(brotlicffi) \
python39-brotlicffi \
python39-brotlicffi(aarch-64) \
python3dist(brotlicffi)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python39-cffi"

inherit rpm
