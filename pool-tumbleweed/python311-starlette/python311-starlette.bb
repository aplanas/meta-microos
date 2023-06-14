SUMMARY = "Lightweight ASGI framework/toolkit"
DESCRIPTION = "Starlette is a lightweight ASGI framework/toolkit, which is ideal for \
building high performance asyncio services."
LICENSE = "BSD-3-Clause"

PV = "0.27.0"

RPM_NAME = "python311-starlette-0.27.0-1.1.noarch.rpm"
RPM_HASH = "2e2b6e95c801cd287399bca6827a053ff5dbb1a310df6d1140fd806eb00c0e0bbc43194d61af905c0bd1b0565cfee48cf468d61ec7658092b28eab3a595dde84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-starlette \
python311-starlette \
python3dist-starlette"

RDEPENDS:${PN} += "-python311-typing-extensions >= 3.10.0 if python311-base < 3.10 \
python-abi \
python311-anyio"

inherit rpm
