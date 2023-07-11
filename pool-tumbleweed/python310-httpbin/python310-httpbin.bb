SUMMARY = "HTTP Request and Response Service"
DESCRIPTION = "httpbin(1): HTTP Request & Response Service \
 \
Testing an HTTP Library can become difficult sometimes. \
RequestBin is fantastic for testing POST requests, but doesn't let \
you control the response. This exists to cover \
all kinds of HTTP scenarios. Additional endpoints are being considered. \
 \
All endpoint responses are JSON-encoded."
LICENSE = "MIT"

PV = "0.7.0+git20181107.f8ec666"

RPM_NAME = "python310-httpbin-0.7.0+git20181107.f8ec666-7.1.noarch.rpm"
RPM_HASH = "f0d08042b810a74c1ca3ca05ed8f253e5fdc40de7e1ff344c390d094ab37d350b11bd4bec694313d127021d29dd04d71f46b52e9b8899eb12c808c1a9c59b5a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-httpbin \
python310-httpbin \
python3dist-httpbin"

RDEPENDS:${PN} += "python-abi \
python310-Brotli \
python310-Flask \
python310-MarkupSafe \
python310-Werkzeug \
python310-decorator \
python310-flasgger \
python310-gevent \
python310-itsdangerous \
python310-six"

inherit rpm
