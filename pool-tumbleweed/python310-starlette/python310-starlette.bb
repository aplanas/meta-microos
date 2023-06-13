SUMMARY = "Lightweight ASGI framework/toolkit"
DESCRIPTION = "Starlette is a lightweight ASGI framework/toolkit, which is ideal for \
building high performance asyncio services."
LICENSE = "BSD-3-Clause"

PV = "0.27.0"

RPM_NAME = "python310-starlette-0.27.0-1.1.noarch.rpm"
RPM_HASH = "59b3348099804414e610aea4b014a53e30a95e5205ce54952a3408cee909b7ed0d7f7294ea44fd43ceaa26dbf75d85a1bd23e806a3101c445c0c539e1f2d7565"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-starlette \
python3.10dist(starlette) \
python310-starlette \
python3dist(starlette)"

RDEPENDS:${PN} += "(python310-typing_extensions >= 3.10.0 if python310-base < 3.10) \
python(abi) \
python310-anyio"

inherit rpm
