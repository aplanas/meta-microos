SUMMARY = "WSGI Proxy Implementation"
DESCRIPTION = "Proxy support for WebOb or classic WSGI applications"
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python311-WSGIProxy2-0.5.1-3.2.noarch.rpm"
RPM_HASH = "5c79f24eb1f42266eef03e02c333c0f3e456bc4bf99b6c359e27af301387df28ebf47fbda4cb761f4efe3240214c8117e0985014500cdd92d7b6697db656e13a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-WSGIProxy2 \
python3.11dist-wsgiproxy2 \
python311-WSGIProxy2 \
python3dist-wsgiproxy2"

RDEPENDS:${PN} += "python-abi \
python311-WebOb \
python311-requests \
python311-urllib3"

inherit rpm
