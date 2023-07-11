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

RPM_NAME = "python311-siosocks-0.3.0-1.5.noarch.rpm"
RPM_HASH = "880831892d4bad25c12599cfe8e68b92234b362498d3cc9406792e43f15fa47d46834349ba34e15cd09b40b0d884bf0d1967750b71968ccbc615e90719b645eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-siosocks \
python3.11dist-siosocks \
python311-siosocks \
python3dist-siosocks"

RDEPENDS:${PN} += "python-abi \
python311-trio"

inherit rpm
