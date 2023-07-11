SUMMARY = "Lightweight ASGI framework/toolkit"
DESCRIPTION = "Starlette is a lightweight ASGI framework/toolkit, which is ideal for \
building high performance asyncio services."
LICENSE = "BSD-3-Clause"

PV = "0.27.0"

RPM_NAME = "python39-starlette-0.27.0-2.3.noarch.rpm"
RPM_HASH = "c510092cb9405bf96605966eadfc2bdd5b9809ff7091b47386416b1d8c37f72ba023c991d259648d2caf4cae39250064f5e9ff494f4acfb56c1f4324d87467b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-starlette \
python39-starlette \
python3dist-starlette"

RDEPENDS:${PN} += "python-abi \
python39-anyio"

inherit rpm
