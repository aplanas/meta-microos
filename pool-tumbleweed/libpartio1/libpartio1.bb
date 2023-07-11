SUMMARY = "Core partio libraries"
DESCRIPTION = "C++ (with python bindings) library for easily reading/writing/manipulating \
common animation particle formats such as PDB, BGEO, PTC."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libpartio1-1.14.6-1.10.aarch64.rpm"
RPM_HASH = "db58756ebfbe78ffc6ba99957842ecb5f315576ebdb2839b16a590607e5b14c4fd0cfa432ef9adcb83aa01e2b0a2e7aab615d7c9d62f65ac8dcac6a6c5f07add"

RPROVIDES:${PN} += "libpartio.so.1 \
libpartio1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
