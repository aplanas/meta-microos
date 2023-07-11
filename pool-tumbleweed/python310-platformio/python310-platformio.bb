SUMMARY = "New Generation Ecosystem for Embedded Development"
DESCRIPTION = "PlatformIO is a cross-platform, cross-architecture, multiple framework, \
professional tool for embedded systems engineers and for software developers \
who write applications for embedded products."
LICENSE = "Apache-2.0"

PV = "6.1.5"

RPM_NAME = "python310-platformio-6.1.5-2.6.noarch.rpm"
RPM_HASH = "ae07b8ba768b0b3588d0fae609b24a1ef54363f5fa7ccb9c69550569221020ba152938fa36070425e2f9c033f67da5a80e2b64cbcbf2e5ad96d5d4f27730f4a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-platformio \
python310-platformio \
python3dist-platformio"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-aiofiles \
python310-ajsonrpc \
python310-bottle \
python310-click \
python310-colorama \
python310-marshmallow \
python310-pyelftools \
python310-pyserial \
python310-requests \
python310-semantic-version \
python310-starlette \
python310-tabulate \
python310-uvicorn \
python310-wsproto \
python310-zeroconf \
update-alternatives"

inherit rpm
