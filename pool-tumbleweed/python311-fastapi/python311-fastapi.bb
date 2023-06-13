SUMMARY = "FastAPI framework"
DESCRIPTION = "Python FastAPI framework."
LICENSE = "MIT"

PV = "0.95.2"

RPM_NAME = "python311-fastapi-0.95.2-1.1.noarch.rpm"
RPM_HASH = "23a11a122a0cfaf52bde0c428e63d806bbd19bd1d68affc059c99af3ca1a4f790f30964b6ec2b89b589081b4f497b63fd1a3d0da1c65c5243782dc57f04e4ef8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(fastapi) \
python311-fastapi \
python3dist(fastapi)"

RDEPENDS:${PN} += "python(abi) \
python311-pydantic \
python311-starlette"

inherit rpm
