SUMMARY = "Basic immutable container types for Python"
DESCRIPTION = "Basic immutable container types for Python. \
 \
A simple implementation that's designed for simplicity over performance. \
 \
Use these in circumstances where it may result in more comprehensible code, or \
when you want to create custom types with restricted, immutable interfaces."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "python310-itypes-1.2.0-2.1.noarch.rpm"
RPM_HASH = "c58733c2e7fc24aac0b11cff331ddefc14bcb90a19c66ee2c4f47859f978779e2333302052edf2ab354c4c3a032cbeaa324a2a419d5cedc7d1ffb0a8f6ea7d6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-itypes \
python310-itypes \
python3dist-itypes"

RDEPENDS:${PN} += "python-abi"

inherit rpm
