SUMMARY = "Adapter to running ASGI applications on aiohttp"
DESCRIPTION = "Adapter to running ASGI applications on aiohttp."
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "python310-aiohttp-asgi-0.5.2-1.3.noarch.rpm"
RPM_HASH = "d54e5c36c419525bbc9439bf4576c2d1bb6fba79e2e7eaff225196ec55a11a280e48514ec79438492763210d4a2f523955d4c8fe18ce0fa4ebae59ac7beac182"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aiohttp-asgi \
python310-aiohttp-asgi \
python3dist-aiohttp-asgi"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-aiohttp"

inherit rpm
