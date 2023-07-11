SUMMARY = "Core proxy client functionality for Python"
DESCRIPTION = "The python-socks package provides a core proxy client functionality for Python. \
Supports SOCKS4(a), SOCKS5, HTTP (tunneling) proxy and provides sync and async \
(asyncio, trio, curio) APIs. You probably don't need to use python-socks \
directly. It is used internally by aiohttp-socks and httpx-socks packages."
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "python311-python-socks-2.1.1-2.1.noarch.rpm"
RPM_HASH = "9f905139a1de4335ea7173031f514c47c1f9b70ec5aa6f70af41b18ca8e464c1b8af7464c14ca4830abe590afbdda0498e564b9d3a1f969b7bd0a6c144e27333"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-socks \
python3.11dist-python-socks \
python311-python-socks \
python3dist-python-socks"

RDEPENDS:${PN} += "python-abi"

inherit rpm
