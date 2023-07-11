SUMMARY = "Adapter to running ASGI applications on aiohttp"
DESCRIPTION = "Adapter to running ASGI applications on aiohttp."
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "python311-aiohttp-asgi-0.5.2-1.3.noarch.rpm"
RPM_HASH = "ca9adeff1fa8e6f4fc0ae3c7b2120eb65e3f592118dec2390e445a19d9742fae2cd266d93343bee822e81b5e97d59b202f5af37c3776d70e7cdd8046976b4de5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiohttp-asgi \
python3.11dist-aiohttp-asgi \
python311-aiohttp-asgi \
python3dist-aiohttp-asgi"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-aiohttp"

inherit rpm
