SUMMARY = "FastAPI framework"
DESCRIPTION = "Python FastAPI framework."
LICENSE = "MIT"

PV = "0.98.0"

RPM_NAME = "python311-fastapi-0.98.0-1.1.noarch.rpm"
RPM_HASH = "7c3f42a724b4a573580b19c5462a350b746e5652098b845b729833322c383783ee10acee08f1e0609c29e295615ad0db88aedfee9bbbf3da844b0424b398a1a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fastapi \
python3.11dist-fastapi \
python311-fastapi \
python3dist-fastapi"

RDEPENDS:${PN} += "python-abi \
python311-pydantic \
python311-starlette"

inherit rpm
