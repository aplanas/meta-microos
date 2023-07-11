SUMMARY = "Lightweight ASGI framework/toolkit"
DESCRIPTION = "Starlette is a lightweight ASGI framework/toolkit, which is ideal for \
building high performance asyncio services."
LICENSE = "BSD-3-Clause"

PV = "0.27.0"

RPM_NAME = "python311-starlette-0.27.0-2.3.noarch.rpm"
RPM_HASH = "b24ac0250ee9a00d48ded96f321636717f5aff41bffa1e4b472321c36062b59810572595fe0f76ee75040d94bcdebae61800f4aab9035e3be66c5ecc4e0d27ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-starlette \
python3.11dist-starlette \
python311-starlette \
python3dist-starlette"

RDEPENDS:${PN} += "python-abi \
python311-anyio"

inherit rpm
