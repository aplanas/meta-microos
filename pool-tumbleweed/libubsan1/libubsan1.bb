SUMMARY = "The GNU Compiler Undefined Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=undefined option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7597"

RPM_NAME = "libubsan1-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "a65bb2b047c9628498c5af1e4a36c213253ef59ef2c3351f4fcb41831c3f629515c27702561c1058b4edce5c50597e2d3993f7d8c779704dc51251d2cfef62b5"

RPROVIDES:${PN} += "libubsan.so.1 \
libubsan1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
