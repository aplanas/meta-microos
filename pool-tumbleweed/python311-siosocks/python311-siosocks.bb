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

RPM_NAME = "python311-siosocks-0.3.0-1.3.noarch.rpm"
RPM_HASH = "07ac15446dbcf6d45bba0f32db864045f008d3927338ef369a7765286b58efb3a2a3a09f357d4dd32453c104b4e0a5f4909b237ff3d05076ced073c1366eb4cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(siosocks) \
python311-siosocks \
python3dist(siosocks)"

RDEPENDS:${PN} += "python(abi) \
python311-trio"

inherit rpm
