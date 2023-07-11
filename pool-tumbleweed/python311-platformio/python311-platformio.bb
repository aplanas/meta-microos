SUMMARY = "New Generation Ecosystem for Embedded Development"
DESCRIPTION = "PlatformIO is a cross-platform, cross-architecture, multiple framework, \
professional tool for embedded systems engineers and for software developers \
who write applications for embedded products."
LICENSE = "Apache-2.0"

PV = "6.1.5"

RPM_NAME = "python311-platformio-6.1.5-2.6.noarch.rpm"
RPM_HASH = "66f51bf17c5a4d3fe16072f7d9280303b67e7f86b365d099d02dad74bc8f88ead95f3847914d64676f29065158df5df539ab240f8dc27edf610f709084a5f478"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-platformio \
python3.11dist-platformio \
python311-platformio \
python3dist-platformio"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-aiofiles \
python311-ajsonrpc \
python311-bottle \
python311-click \
python311-colorama \
python311-marshmallow \
python311-pyelftools \
python311-pyserial \
python311-requests \
python311-semantic-version \
python311-starlette \
python311-tabulate \
python311-uvicorn \
python311-wsproto \
python311-zeroconf \
update-alternatives"

inherit rpm
