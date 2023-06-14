SUMMARY = "Adapter to running ASGI applications on aiohttp"
DESCRIPTION = "Adapter to running ASGI applications on aiohttp."
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "python39-aiohttp-asgi-0.5.2-1.1.noarch.rpm"
RPM_HASH = "57d76ef2156e97c66ebba4a57ff85e58aafa73ee956fd2cd4e8cd17cb9fb5c8304fecfab53b6347ed69383d38d999755b2182346fe1ccb20ed131869074d516c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aiohttp-asgi \
python39-aiohttp-asgi \
python3dist-aiohttp-asgi"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-aiohttp"

inherit rpm
