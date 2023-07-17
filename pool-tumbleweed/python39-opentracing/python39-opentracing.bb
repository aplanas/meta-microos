SUMMARY = "OpenTracing API for Python"
DESCRIPTION = "OpenTracing API for Python. \
See documentation at http://opentracing.io"
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python39-opentracing-2.4.0-5.1.noarch.rpm"
RPM_HASH = "fe0fd79ac87c664cff6f7b772442fcb465d85bfe93b1f01fe9088efd76e477f1797cc2cc147147aa5a0d1a6ab518c565ed1129f60f9f38880e229aec681661d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-opentracing \
python39-opentracing \
python3dist-opentracing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
