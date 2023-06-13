SUMMARY = "Helper to test WSGI applications"
DESCRIPTION = "This wraps any WSGI application and makes it easy to send test \
requests to that application, without starting up an HTTP server. \
 \
This provides convenient full-stack testing of applications written \
with any WSGI-compatible framework."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-WebTest-3.0.0-4.1.noarch.rpm"
RPM_HASH = "0460794cf429302a34e17a7a5ac204d9343f00f38db63bd63d62f4dd047999c46833b93577aaef7dfc5664523a92448d224869b94dfc7d5bcebcc2ba2908a6c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(webtest) \
python39-WebTest \
python3dist(webtest)"

RDEPENDS:${PN} += "python(abi) \
python39-WebOb \
python39-beautifulsoup4 \
python39-waitress"

inherit rpm
