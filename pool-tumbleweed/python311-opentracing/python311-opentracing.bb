SUMMARY = "OpenTracing API for Python"
DESCRIPTION = "OpenTracing API for Python. \
See documentation at http://opentracing.io"
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python311-opentracing-2.4.0-5.1.noarch.rpm"
RPM_HASH = "55d812a7c05001cee1422d46e65ab8bec2192fd0378a1cb14d550eb62571635f0161a00ea457f82f60f9ed52b11057f62c8a65c9158266494a3e2b56384d74a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opentracing \
python3.11dist-opentracing \
python311-opentracing \
python3dist-opentracing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
