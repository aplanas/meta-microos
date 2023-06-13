SUMMARY = "Helper to test WSGI applications"
DESCRIPTION = "This wraps any WSGI application and makes it easy to send test \
requests to that application, without starting up an HTTP server. \
 \
This provides convenient full-stack testing of applications written \
with any WSGI-compatible framework."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-WebTest-3.0.0-4.1.noarch.rpm"
RPM_HASH = "2aaf3019b136e464d53c02a3feed482fdd94f449d9d30ae4852bb6e8c3f07ee16ec606c5258eb328a8b7f6daa46a4e74a361faac04475aa3e021d68b8310935e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-WebTest \
python3.10dist(webtest) \
python310-WebTest \
python3dist(webtest)"

RDEPENDS:${PN} += "python(abi) \
python310-WebOb \
python310-beautifulsoup4 \
python310-waitress"

inherit rpm
