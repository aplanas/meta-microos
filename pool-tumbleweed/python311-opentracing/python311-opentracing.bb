SUMMARY = "OpenTracing API for Python"
DESCRIPTION = "OpenTracing API for Python. \
See documentation at http://opentracing.io"
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python311-opentracing-2.4.0-4.4.noarch.rpm"
RPM_HASH = "6b397eebb57bc3d5395b095ea62b1a7918824ca2e4e4e80c3d9a750cf5963dde439c57972c31854c6cdaea9ed9b34e60854ea875ff3a0e81d4016eb47a82b0ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opentracing \
python3.11dist-opentracing \
python311-opentracing \
python3dist-opentracing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
