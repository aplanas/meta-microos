SUMMARY = "New Generation Ecosystem for Embedded Development"
DESCRIPTION = "PlatformIO is a cross-platform, cross-architecture, multiple framework, \
professional tool for embedded systems engineers and for software developers \
who write applications for embedded products."
LICENSE = "Apache-2.0"

PV = "6.1.5"

RPM_NAME = "python39-platformio-6.1.5-2.4.noarch.rpm"
RPM_HASH = "ff3ac30cfe686255d072a2fc6c173467e29c6f81f0fb573357fa6c2507dffda9e2572ab2d9ca4e238caaeff84939b76de75e4727c441423f0e90dc351c24a8f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-platformio \
python39-platformio \
python3dist-platformio"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-aiofiles \
python39-ajsonrpc \
python39-bottle \
python39-click \
python39-colorama \
python39-marshmallow \
python39-pyelftools \
python39-pyserial \
python39-requests \
python39-semantic-version \
python39-starlette \
python39-tabulate \
python39-uvicorn \
python39-wsproto \
python39-zeroconf \
update-alternatives"

inherit rpm
