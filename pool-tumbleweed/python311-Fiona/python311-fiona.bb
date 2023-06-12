SUMMARY = "Module for reading and writing spatial data files"
DESCRIPTION = "Fiona is OGR's spatial data API for Python programmers."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "python311-Fiona-1.9.1-1.3.aarch64.rpm"
RPM_HASH = "b48acb045267a7db307cd685dd19e16c402b81341ced928955e0af7058494cc462636ca085442bcbc31d5f463574d7306b87626bfa992aac665504c38a1428b6"

RPROVIDES:${PN} += "python3.11dist(fiona) \
python311-Fiona \
python311-Fiona(aarch-64) \
python3dist(fiona)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgdal.so.32()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
python(abi) \
python311-attrs \
python311-click \
python311-click-plugins \
python311-cligj \
python311-munch \
python311-six"

inherit rpm
