SUMMARY = "WSGI Proxy Implementation"
DESCRIPTION = "Proxy support for WebOb or classic WSGI applications"
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python310-WSGIProxy2-0.5.1-3.2.noarch.rpm"
RPM_HASH = "f1d8e3ee2c79387f102248f675de54510edaf1c3cff1eaf25208ec499ffaacf8de37a36646df4e295de2b48637cb55dfb9921bc099028418e5b7fe11f5823907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wsgiproxy2 \
python310-WSGIProxy2 \
python3dist-wsgiproxy2"

RDEPENDS:${PN} += "python-abi \
python310-WebOb \
python310-requests \
python310-urllib3"

inherit rpm
