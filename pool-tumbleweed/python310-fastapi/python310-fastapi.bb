SUMMARY = "FastAPI framework"
DESCRIPTION = "Python FastAPI framework."
LICENSE = "MIT"

PV = "0.98.0"

RPM_NAME = "python310-fastapi-0.98.0-1.1.noarch.rpm"
RPM_HASH = "194e105faabeff41d2aac59d9978925b8a10c2d86e563353e9f50773ce90acceba861c9137e3ee95e85051785a32488f108e1771bdf849b0736fe910e43c2811"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fastapi \
python310-fastapi \
python3dist-fastapi"

RDEPENDS:${PN} += "python-abi \
python310-pydantic \
python310-starlette"

inherit rpm
