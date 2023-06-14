SUMMARY = "Lightweight ASGI framework/toolkit"
DESCRIPTION = "Starlette is a lightweight ASGI framework/toolkit, which is ideal for \
building high performance asyncio services."
LICENSE = "BSD-3-Clause"

PV = "0.27.0"

RPM_NAME = "python39-starlette-0.27.0-1.1.noarch.rpm"
RPM_HASH = "dce9b16a2dcbe206920766d5886a121ebc78fa7db7d7fe5889429a6c40646be048a12b031f9d3465e0cd75bf9ab27dfdccf6e49d0f937030020fc36593406a17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-starlette \
python39-starlette \
python3dist-starlette"

RDEPENDS:${PN} += "-python39-typing-extensions >= 3.10.0 if python39-base < 3.10 \
python-abi \
python39-anyio"

inherit rpm
