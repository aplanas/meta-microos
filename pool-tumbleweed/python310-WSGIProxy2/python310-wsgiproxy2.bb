SUMMARY = "WSGI Proxy Implementation"
DESCRIPTION = "Proxy support for WebOb or classic WSGI applications"
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python310-WSGIProxy2-0.5.1-3.1.noarch.rpm"
RPM_HASH = "eaa73f1e2a91d0a37071616957d437e581f2c772c654b9870b00dccf7d8dfec5a81652e5efd99750170ed729b7eac6a2da79b7cdb51d2062b1329d46bbfdde82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-WSGIProxy2 \
python3.10dist(wsgiproxy2) \
python310-WSGIProxy2 \
python3dist(wsgiproxy2)"

RDEPENDS:${PN} += "python(abi) \
python310-WebOb \
python310-requests \
python310-urllib3"

inherit rpm
