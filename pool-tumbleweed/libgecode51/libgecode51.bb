SUMMARY = "C++ toolkit for developing constraint-based systems"
DESCRIPTION = "Gecode is an open source C++ toolkit for developing constraint-based \
systems and applications. Gecode provides a constraint solver with \
state-of-the-art performance while being modular and extensible."
LICENSE = "MIT"

PV = "6.3.0~git20211208.6b09bea4"

RPM_NAME = "libgecode51-6.3.0~git20211208.6b09bea4-1.6.aarch64.rpm"
RPM_HASH = "6156f3547e99da7a6c0fbae2f1cca0e046f7d80022393e8c0eea03de2de03e698cef1ad08d15b1c86adcb0b6c2cff91dc82208ea14fe6ea07ea6f70a5c92dcbe"

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
