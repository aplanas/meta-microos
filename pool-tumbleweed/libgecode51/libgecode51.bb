SUMMARY = "C++ toolkit for developing constraint-based systems"
DESCRIPTION = "Gecode is an open source C++ toolkit for developing constraint-based \
systems and applications. Gecode provides a constraint solver with \
state-of-the-art performance while being modular and extensible."
LICENSE = "MIT"

PV = "6.3.0~git20211208.6b09bea4"

RPM_NAME = "libgecode51-6.3.0~git20211208.6b09bea4-1.5.aarch64.rpm"
RPM_HASH = "d9ff2647bbc60c73a26ed766b6fe3cad15a02436850c45bf7f4bba991a45964cb009bbb52eb5b07c12b88febbc5ff5b527752e09bc180144860aa71f14784709"

RPROVIDES:${PN} += "libgecode51 \
libgecodedriver.so.51 \
libgecodefloat.so.51 \
libgecodeint.so.51 \
libgecodekernel.so.51 \
libgecodeminimodel.so.51 \
libgecodesearch.so.51 \
libgecodeset.so.51 \
libgecodesupport.so.51"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
