SUMMARY = "Package provides recommended R-KernSmooth"
DESCRIPTION = "This packages provides R-KernSmooth, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.23.20"

RPM_NAME = "R-KernSmooth-2.23.20-45.2.aarch64.rpm"
RPM_HASH = "f25ea212c8c319154acb434d4fb21508f9a383f12300ef8fabef9ab61c49b79758761c2163d973eb96f9aac700cc6096765c469090fc82323e996b64b4830c66"

RPROVIDES:${PN} += "R-KernSmooth"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libRblas.so \
libc.so.6 \
libm.so.6"

inherit rpm
