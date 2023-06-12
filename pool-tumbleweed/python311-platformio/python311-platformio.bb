SUMMARY = "New Generation Ecosystem for Embedded Development"
DESCRIPTION = "PlatformIO is a cross-platform, cross-architecture, multiple framework, \
professional tool for embedded systems engineers and for software developers \
who write applications for embedded products."
LICENSE = "Apache-2.0"

PV = "6.1.5"

RPM_NAME = "python311-platformio-6.1.5-2.4.noarch.rpm"
RPM_HASH = "adf87946f5dfb0991e0b96194278506bb4c2dd242482f57b28bd361d3ce430867141cceecc9cf2e7ff6d2ce712d1f72d1935cbec663ce187565bb70b46d7c9f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(platformio) \
python311-platformio \
python3dist(platformio)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-aiofiles \
python311-ajsonrpc \
python311-bottle \
python311-click \
python311-colorama \
python311-marshmallow \
python311-pyelftools \
python311-pyserial \
python311-requests \
python311-semantic_version \
python311-starlette \
python311-tabulate \
python311-uvicorn \
python311-wsproto \
python311-zeroconf \
update-alternatives"

inherit rpm
