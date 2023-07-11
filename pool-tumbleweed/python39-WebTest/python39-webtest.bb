SUMMARY = "Helper to test WSGI applications"
DESCRIPTION = "This wraps any WSGI application and makes it easy to send test \
requests to that application, without starting up an HTTP server. \
 \
This provides convenient full-stack testing of applications written \
with any WSGI-compatible framework."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-WebTest-3.0.0-4.3.noarch.rpm"
RPM_HASH = "541e38d7251edb2167a421740a7a3108b5ee98e61025c166d54116ebad53d4d0365752b03eefa0939b53ba274b50a112f7b62103a19e16668b143c89f8912dac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-webtest \
python39-WebTest \
python3dist-webtest"

RDEPENDS:${PN} += "python-abi \
python39-WebOb \
python39-beautifulsoup4 \
python39-waitress"

inherit rpm
