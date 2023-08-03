SUMMARY = "Helper to test WSGI applications"
DESCRIPTION = "This wraps any WSGI application and makes it easy to send test \
requests to that application, without starting up an HTTP server. \
 \
This provides convenient full-stack testing of applications written \
with any WSGI-compatible framework."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-WebTest-3.0.0-5.1.noarch.rpm"
RPM_HASH = "be1c540098de37a6d73e15e77834c9679c5f150c5a52308f27bdd490668b068f35f53702dfa4d76e6112b5d8d5aaf40a807044a61c4005c381d8b855666b622d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-webtest \
python39-WebTest \
python3dist-webtest"

RDEPENDS:${PN} += "python-abi \
python39-WebOb \
python39-beautifulsoup4 \
python39-waitress"

inherit rpm
