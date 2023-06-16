SUMMARY = "Gecode minizinc solver"
DESCRIPTION = "Minizinc solver using the Gecode toolkit."
LICENSE = "MIT"

PV = "6.3.0~git20211208.6b09bea4"

RPM_NAME = "gecode-minizinc-6.3.0~git20211208.6b09bea4-1.5.aarch64.rpm"
RPM_HASH = "c6b3cabe925b8ec8e59254fc9888edd2d2a10ba4b2618a34d070973873270bf49fe8979cd6509314cf8b267079d5375b023f8b44a96bbb3e130a0658abff6348"

RPROVIDES:${PN} += "gecode-minizinc \
libgecodeflatzinc.so.51 \
minizinc-solver"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgecodedriver.so.51 \
libgecodefloat.so.51 \
libgecodeint.so.51 \
libgecodekernel.so.51 \
libgecodeminimodel.so.51 \
libgecodesearch.so.51 \
libgecodeset.so.51 \
libgecodesupport.so.51 \
libm.so.6 \
libstdc++.so.6 \
minizinc"

inherit rpm
