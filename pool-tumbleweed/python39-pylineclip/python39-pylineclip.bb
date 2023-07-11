SUMMARY = "Line clipping tool"
DESCRIPTION = "Line clipping: Cohen-Sutherland"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-pylineclip-1.0.0-2.12.noarch.rpm"
RPM_HASH = "9d1857970e970e8f03cf6018fc0a3f1169fff980b39f5a3c7930357d3e6f4de41b41884068474e70f06b10c4d65f7a564a5842befd9ca0d1aabf59cd24a47fd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pylineclip \
python39-pylineclip \
python3dist-pylineclip"

RDEPENDS:${PN} += "python-abi"

inherit rpm
