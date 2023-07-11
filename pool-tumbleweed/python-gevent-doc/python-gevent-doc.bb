SUMMARY = "Documentation for python-gevent"
DESCRIPTION = "Documentation and examples for python-gevent."
LICENSE = "MIT"

PV = "22.10.2"

RPM_NAME = "python-gevent-doc-22.10.2-3.2.noarch.rpm"
RPM_HASH = "f70749b5ade33b5866396478e779dbd633bc74ae991f9f603511e9418f468b986d1fe7287788cd2346cd082c9f86be7c6afe4cba50503e4a7a2c12ed4cc788c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-gevent-doc \
python310-gevent-doc \
python311-gevent-doc \
python39-gevent-doc"

RDEPENDS:${PN} += ""

inherit rpm
