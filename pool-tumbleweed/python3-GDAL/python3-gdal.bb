SUMMARY = "GDAL Python3 module"
DESCRIPTION = "The GDAL python modules provide support to handle multiple GIS file formats."
LICENSE = "BSD-3-Clause & MIT & SUSE-Public-Domain"

PV = "3.6.3"

RPM_NAME = "python3-GDAL-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "40bd876b3ad11995828b42d706e7cc76e1b95e62fc7f9cf77ae0d38f1218f918a1c2b01eb6130ef8ecd626bdd4f61b90b79dae89e3a6dfa5e17ed9a585a3bf6a"

RPROVIDES:${PN} += "python3-GDAL \
python3-GDAL(aarch-64) \
python3-gdal \
python3.10dist(gdal) \
python3dist(gdal)"

RDEPENDS:${PN} += "gdal \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgdal.so.32()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
python(abi)"

inherit rpm
