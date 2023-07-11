SUMMARY = "FastAPI framework"
DESCRIPTION = "Python FastAPI framework."
LICENSE = "MIT"

PV = "0.98.0"

RPM_NAME = "python39-fastapi-0.98.0-1.1.noarch.rpm"
RPM_HASH = "321ded144a81ca8580eebe15d8639fd0acd8201d7b45c8ff6584a0eb1578489578a94debd100d41221b048b38912510806d97c45b599e5cab95d02630da38577"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fastapi \
python39-fastapi \
python3dist-fastapi"

RDEPENDS:${PN} += "python-abi \
python39-pydantic \
python39-starlette"

inherit rpm
