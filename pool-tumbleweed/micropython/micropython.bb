SUMMARY = "Implementation of Python 3 with very low memory footprint"
DESCRIPTION = "A lean and efficient Python implementation for microcontrollers and constrained systems"
LICENSE = "MIT"

PV = "1.20.0"

RPM_NAME = "micropython-1.20.0-1.1.aarch64.rpm"
RPM_HASH = "1de930a6c6fbfc701264aad379c1971c2172a75bc26e3b862f03c3970aa90dfaa617d4d7e540ebd3143c7cace503181388cf8177dfbdfce6687815377204dadf"

RPROVIDES:${PN} += "micropython \
micropython(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libffi.so.8()(64bit) \
libffi.so.8(LIBFFI_BASE_8.0)(64bit) \
libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.23)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
