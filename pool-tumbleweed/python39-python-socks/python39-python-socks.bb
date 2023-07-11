SUMMARY = "Core proxy client functionality for Python"
DESCRIPTION = "The python-socks package provides a core proxy client functionality for Python. \
Supports SOCKS4(a), SOCKS5, HTTP (tunneling) proxy and provides sync and async \
(asyncio, trio, curio) APIs. You probably don't need to use python-socks \
directly. It is used internally by aiohttp-socks and httpx-socks packages."
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "python39-python-socks-2.1.1-2.1.noarch.rpm"
RPM_HASH = "7c77e0d132a7d4cd48d9e150c00b31f7f6c525cafe3eb49c8d574dcdfe6b28d88ac2ce3493b6e4e3bed74c440171037dd9aa0ce28ea252f9dc86e53b2f7267da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-socks \
python39-python-socks \
python3dist-python-socks"

RDEPENDS:${PN} += "python-abi"

inherit rpm
