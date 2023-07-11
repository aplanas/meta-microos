SUMMARY = "Gecode minizinc solver"
DESCRIPTION = "Minizinc solver using the Gecode toolkit."
LICENSE = "MIT"

PV = "6.3.0~git20211208.6b09bea4"

RPM_NAME = "gecode-minizinc-6.3.0~git20211208.6b09bea4-1.6.aarch64.rpm"
RPM_HASH = "e05fcd620ebd05d502c2e086c432be911be87d5a8eef8a980605787e3b52c0b86a9bb62d3eb135b614318e16f8a9019bfa9b6898d3c6fb2faceba4d272cf2c14"

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
