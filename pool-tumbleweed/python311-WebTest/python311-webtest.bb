SUMMARY = "Helper to test WSGI applications"
DESCRIPTION = "This wraps any WSGI application and makes it easy to send test \
requests to that application, without starting up an HTTP server. \
 \
This provides convenient full-stack testing of applications written \
with any WSGI-compatible framework."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-WebTest-3.0.0-4.3.noarch.rpm"
RPM_HASH = "2628853e5bd9f7bf2ed2ddb55e7f4ab1c254bfefaabc68308efadf46313791771484af311ee9e013a2cc88d131dba4af296a813df8480151707664d757f7dbab"
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
