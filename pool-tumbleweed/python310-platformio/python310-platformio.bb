SUMMARY = "New Generation Ecosystem for Embedded Development"
DESCRIPTION = "PlatformIO is a cross-platform, cross-architecture, multiple framework, \
professional tool for embedded systems engineers and for software developers \
who write applications for embedded products."
LICENSE = "Apache-2.0"

PV = "6.1.5"

RPM_NAME = "python310-platformio-6.1.5-2.4.noarch.rpm"
RPM_HASH = "d444f6db86b10020c879319aec4be224d947c172bb66f1a3dc8eaeb10dc6df03fbcdb64a462d2aa7df0250f33c9040ebf688968753b5b571f8cde92d3d50045b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-platformio \
python3.10dist(platformio) \
python310-platformio \
python3dist(platformio)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-aiofiles \
python310-ajsonrpc \
python310-bottle \
python310-click \
python310-colorama \
python310-marshmallow \
python310-pyelftools \
python310-pyserial \
python310-requests \
python310-semantic_version \
python310-starlette \
python310-tabulate \
python310-uvicorn \
python310-wsproto \
python310-zeroconf \
update-alternatives"

inherit rpm
