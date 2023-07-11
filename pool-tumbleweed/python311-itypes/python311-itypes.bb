SUMMARY = "Basic immutable container types for Python"
DESCRIPTION = "Basic immutable container types for Python. \
 \
A simple implementation that's designed for simplicity over performance. \
 \
Use these in circumstances where it may result in more comprehensible code, or \
when you want to create custom types with restricted, immutable interfaces."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "python311-itypes-1.2.0-2.1.noarch.rpm"
RPM_HASH = "4f91fd7b6f1ee965b63bcb247ba7e0249822badfd5bc93c7afb955bedc0b5761dba734b370512da17d3d95cd07de9d192c22816fde5d288af40a3d8a112e622e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-itypes \
python3.11dist-itypes \
python311-itypes \
python3dist-itypes"

RDEPENDS:${PN} += "python-abi"

inherit rpm
