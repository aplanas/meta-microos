SUMMARY = "A library for spatial indexing"
DESCRIPTION = "libspatialindex provides a general framework for developing spatial indices. \
Currently it defines generic interfaces, provides simple main memory and disk \
based storage managers and a robust implementation of an R*-tree, an MVR-tree \
and a TPR-tree."
LICENSE = "MIT"

PV = "1.9.3"

RPM_NAME = "libspatialindex6-1.9.3-2.10.aarch64.rpm"
RPM_HASH = "745d796d2d3043a7207558c06ad2c6e4322f2ff49723123552fad3bedd8596d697e1bc66fa60d6b3268f3184297289cf957fe8fe1115d7a55889eac9ab7a1645"

RPROVIDES:${PN} += "libspatialindex-c.so.6 \
libspatialindex.so.6 \
libspatialindex6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
