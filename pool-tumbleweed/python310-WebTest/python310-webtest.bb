SUMMARY = "Helper to test WSGI applications"
DESCRIPTION = "This wraps any WSGI application and makes it easy to send test \
requests to that application, without starting up an HTTP server. \
 \
This provides convenient full-stack testing of applications written \
with any WSGI-compatible framework."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-WebTest-3.0.0-4.3.noarch.rpm"
RPM_HASH = "ed6e0fe9a4ed807bc57c28430819eaadfdbb2c973c285082cf020920c17d8d20a2ecc8e10f710ee3fa9cb6d0371d888e02a402ccb5d8cfdbed30e78dc850e243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-webtest \
python310-WebTest \
python3dist-webtest"

RDEPENDS:${PN} += "python-abi \
python310-WebOb \
python310-beautifulsoup4 \
python310-waitress"

inherit rpm
