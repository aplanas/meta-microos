SUMMARY = "Lightweight ASGI framework/toolkit"
DESCRIPTION = "Starlette is a lightweight ASGI framework/toolkit, which is ideal for \
building high performance asyncio services."
LICENSE = "BSD-3-Clause"

PV = "0.27.0"

RPM_NAME = "python310-starlette-0.27.0-2.3.noarch.rpm"
RPM_HASH = "cf3ce0ebd1ca066a27053f0e509ddcd77efe769f10b5885f3559731b6ec8c74fe1313175962739845bf38d4eff4c8606b86087484f3977e49b12ba8d69c6e24a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-starlette \
python310-starlette \
python3dist-starlette"

RDEPENDS:${PN} += "python-abi \
python310-anyio"

inherit rpm
