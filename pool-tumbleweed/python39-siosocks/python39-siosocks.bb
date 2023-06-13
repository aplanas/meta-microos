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

RPM_NAME = "python39-siosocks-0.3.0-1.3.noarch.rpm"
RPM_HASH = "09a30eb52af4b41a3d8003027fab75554eda0f75704521ac749a33ce39b9aab105b21387df15bed40d2804b98643749c281f5dc155a7b1ab91bac6a394f43eb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(siosocks) \
python39-siosocks \
python3dist(siosocks)"

RDEPENDS:${PN} += "python(abi) \
python39-trio"

inherit rpm
