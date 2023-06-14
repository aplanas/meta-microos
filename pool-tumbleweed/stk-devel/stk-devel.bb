SUMMARY = "Development files for STK, a music synthesis library"
DESCRIPTION = "The libstk-devel package contains libraries and header files for \
developing applications that use stk."
LICENSE = "MIT"

PV = "4.6.2"

RPM_NAME = "stk-devel-4.6.2-1.3.aarch64.rpm"
RPM_HASH = "22926bcf1bd7acbcb3dbb7319d3cbfc994445abdd18504887af8c918de612e1f7fb003ab54792270b3cabafeceac47517ec4f73377338524f69c629346313485"

RPROVIDES:${PN} += "libstk-devel \
stk-devel"

RDEPENDS:${PN} += "libstk4.6.2"

inherit rpm
