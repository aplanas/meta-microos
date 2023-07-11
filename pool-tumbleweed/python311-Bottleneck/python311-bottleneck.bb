SUMMARY = "A collection of fast NumPy array functions"
DESCRIPTION = "Bottleneck is a collection of fast NumPy array functions written in C."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "1.3.7"

RPM_NAME = "python311-Bottleneck-1.3.7-1.6.aarch64.rpm"
RPM_HASH = "215883d3d6768bdc968abd7a28deaf6f29816428367f643cab04f7d26e5b0266cb5c0ace9a06da17fdce58ba8f3b23846bd0afd517064727f51d81765631fc49"

RPROVIDES:${PN} += "python3-Bottleneck \
python3.11dist-bottleneck \
python311-Bottleneck \
python3dist-bottleneck"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-numpy"

inherit rpm
