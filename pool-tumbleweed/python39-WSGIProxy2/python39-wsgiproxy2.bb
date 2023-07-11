SUMMARY = "WSGI Proxy Implementation"
DESCRIPTION = "Proxy support for WebOb or classic WSGI applications"
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python39-WSGIProxy2-0.5.1-3.2.noarch.rpm"
RPM_HASH = "772bb902dcc4681abb479620e34581a13475262fe0674f215a12f674d345ba68341fe2eef88c961936dcbdef378c12554745ad187a4bfcd2a9ff8dc55902a912"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wsgiproxy2 \
python39-WSGIProxy2 \
python3dist-wsgiproxy2"

RDEPENDS:${PN} += "python-abi \
python39-WebOb \
python39-requests \
python39-urllib3"

inherit rpm
