SUMMARY = "Basic immutable container types for Python"
DESCRIPTION = "Basic immutable container types for Python. \
 \
A simple implementation that's designed for simplicity over performance. \
 \
Use these in circumstances where it may result in more comprehensible code, or \
when you want to create custom types with restricted, immutable interfaces."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "python311-itypes-1.2.0-1.8.noarch.rpm"
RPM_HASH = "5bf3c3f162d85a0c29f171135e2c5e259b9d72745f2da2a9bf3521e188bf786f4e07ebc8d0aa2c22be90db1d2132838885f62a83f21b652a6943e51d11d4fc33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-itypes \
python311-itypes \
python3dist-itypes"

RDEPENDS:${PN} += "python-abi"

inherit rpm
