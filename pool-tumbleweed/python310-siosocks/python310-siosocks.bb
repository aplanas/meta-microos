SUMMARY = "Sans-io socks proxy client/server with couple io backends"
DESCRIPTION = "Sans-io (https://sans-io.readthedocs.io/) socks 4/5 client/server library/framework. \
 \
 \
* No one-shot socks servers \
* Sans-io \
* asyncio-ready twunnel3 (https://github.com/jvansteirteghem/twunnel3) is dead \
* aiosocks (https://github.com/nibrag/aiosocks) do not mimic `asyncio.open_connection` arguments (maybe dead too) \
* Fun \
 \
 \
* Only tcp connect (no bind, no udp) \
* Both client and server \
* Socks versions: 4, 4a, 5 \
* Socks5 auth: no auth, username/password \
* Couple io backends: asyncio, trio, socketserver \
* One-shot socks server (`python -m siosocks`)"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-siosocks-0.3.0-1.5.noarch.rpm"
RPM_HASH = "1ef3d7f4e1136186ff887b6603269e448fc4a7dedabd32ab92aab4c91831d1179d4fc1120dc967861dd716207c95210f5fff566ec0b2b1a07c03bd3befd1c2a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-siosocks \
python310-siosocks \
python3dist-siosocks"

RDEPENDS:${PN} += "python-abi \
python310-trio"

inherit rpm
