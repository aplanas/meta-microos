SUMMARY = "New Generation Ecosystem for Embedded Development"
DESCRIPTION = "PlatformIO is a cross-platform, cross-architecture, multiple framework, \
professional tool for embedded systems engineers and for software developers \
who write applications for embedded products."
LICENSE = "Apache-2.0"

PV = "6.1.5"

RPM_NAME = "python39-platformio-6.1.5-2.6.noarch.rpm"
RPM_HASH = "fa3e00a5d8fb1a19abb52d84ae2aea32a4f939d43749111c69ba4f2baf12264e8e653dc3681ab64d252aefd218851e47e09e9939f1e4b309993b648f3d29c08d"
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
