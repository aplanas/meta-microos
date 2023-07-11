SUMMARY = "Line clipping tool"
DESCRIPTION = "Line clipping: Cohen-Sutherland"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-pylineclip-1.0.0-2.12.noarch.rpm"
RPM_HASH = "28d8dafb5cbc63b2a3225b72e13cef717a85607329c5b7c292d3fb46fbd1f266548d411e51cc5eb0fa8f20197340dce4bcff3d273cffeb546299d52196061f7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pylineclip \
python310-pylineclip \
python3dist-pylineclip"

RDEPENDS:${PN} += "python-abi"

inherit rpm
