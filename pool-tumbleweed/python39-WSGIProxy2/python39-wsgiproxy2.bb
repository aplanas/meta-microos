SUMMARY = "WSGI Proxy Implementation"
DESCRIPTION = "Proxy support for WebOb or classic WSGI applications"
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python39-WSGIProxy2-0.5.1-3.1.noarch.rpm"
RPM_HASH = "e60f6ba831c45025211ae3294802fa8e5978dac1360cc438cbd157a5e74cdead3f96bbec958aae0bb172c038dc893e0ead9bbd1c6503c4fb8f83f0d7f55203bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(wsgiproxy2) \
python39-WSGIProxy2 \
python3dist(wsgiproxy2)"

RDEPENDS:${PN} += "python(abi) \
python39-WebOb \
python39-requests \
python39-urllib3"

inherit rpm
