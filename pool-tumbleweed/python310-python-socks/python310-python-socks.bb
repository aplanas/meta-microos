SUMMARY = "Core proxy client functionality for Python"
DESCRIPTION = "The python-socks package provides a core proxy client functionality for Python. \
Supports SOCKS4(a), SOCKS5, HTTP (tunneling) proxy and provides sync and async \
(asyncio, trio, curio) APIs. You probably don't need to use python-socks \
directly. It is used internally by aiohttp-socks and httpx-socks packages."
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "python310-python-socks-2.1.1-2.1.noarch.rpm"
RPM_HASH = "3f3a2354a75ed807c66166b8488642e16ed077c69525665cb94cdaec661577bdcf26a56655d55ee292199f84ec32757ed9ae9d002eaa648c87db50c3281c22d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-socks \
python310-python-socks \
python3dist-python-socks"

RDEPENDS:${PN} += "python-abi"

inherit rpm
