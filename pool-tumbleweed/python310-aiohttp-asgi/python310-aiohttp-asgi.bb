SUMMARY = "Adapter to running ASGI applications on aiohttp"
DESCRIPTION = "Adapter to running ASGI applications on aiohttp."
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "python310-aiohttp-asgi-0.5.2-1.1.noarch.rpm"
RPM_HASH = "38fccbf6b85c3e071b45b8c7499dff7e445673a3a80a4a7d8bb73bdadefe62e173c8694d133339ea6f8ae8a2b0db4164691b9aed272e002ce56aeb8ca52aff0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiohttp-asgi \
python3.10dist-aiohttp-asgi \
python310-aiohttp-asgi \
python3dist-aiohttp-asgi"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-aiohttp"

inherit rpm
