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

RPM_NAME = "python39-siosocks-0.3.0-1.5.noarch.rpm"
RPM_HASH = "ab1487f891062bca41e5d684d2f565d34e58f0b77aa7fb630d5ecee2f526aaee3b99ca97015d9c919abf5da79035e3e22085a6552d85bf062f0d09df6ce9d022"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-siosocks \
python39-siosocks \
python3dist-siosocks"

RDEPENDS:${PN} += "python-abi \
python39-trio"

inherit rpm
