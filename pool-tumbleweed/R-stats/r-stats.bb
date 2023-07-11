SUMMARY = "Package providing R-stats"
DESCRIPTION = "This package provides R-stats, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.1"

RPM_NAME = "R-stats-4.3.1-46.1.aarch64.rpm"
RPM_HASH = "43eccf7504003a5a7b5d21d2368053a7c1eaac0a57f10d5dc43d8998d7a43a5dcb03e223600b3e032da191fa5245fadfc8f118aa53dba97db70e427e79f3160a"

RPROVIDES:${PN} += "R-stats"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libRblas.so \
libRlapack.so \
libc.so.6 \
libgomp.so.1 \
libm.so.6"

inherit rpm
