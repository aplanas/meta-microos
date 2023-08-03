SUMMARY = "Helper to test WSGI applications"
DESCRIPTION = "This wraps any WSGI application and makes it easy to send test \
requests to that application, without starting up an HTTP server. \
 \
This provides convenient full-stack testing of applications written \
with any WSGI-compatible framework."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-WebTest-3.0.0-5.1.noarch.rpm"
RPM_HASH = "4f15e199393ac27d7d3b735ec4d73b10a2e958ea6cc67587421d4f7a32c02995d457893588dd1e31b6c70d7b53704cbdaa038bb1dc942cc676558c8eb6bcae10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-webtest \
python310-WebTest \
python3dist-webtest"

RDEPENDS:${PN} += "python-abi \
python310-WebOb \
python310-beautifulsoup4 \
python310-waitress"

inherit rpm
