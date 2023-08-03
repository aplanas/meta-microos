SUMMARY = "Helper to test WSGI applications"
DESCRIPTION = "This wraps any WSGI application and makes it easy to send test \
requests to that application, without starting up an HTTP server. \
 \
This provides convenient full-stack testing of applications written \
with any WSGI-compatible framework."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-WebTest-3.0.0-5.1.noarch.rpm"
RPM_HASH = "af24f647c4f8efe8e4a0f1e931db0bbbdb557c7dd183d6e89fe5ea50a4f2ec62f27b7cae9469cbcd0922d33e79ea0a966df17bc5e71c5deaf7444e966fe503b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-WebTest \
python3.11dist-webtest \
python311-WebTest \
python3dist-webtest"

RDEPENDS:${PN} += "python-abi \
python311-WebOb \
python311-beautifulsoup4 \
python311-waitress"

inherit rpm
