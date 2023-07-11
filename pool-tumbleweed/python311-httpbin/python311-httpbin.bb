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

RPM_NAME = "python311-httpbin-0.7.0+git20181107.f8ec666-7.1.noarch.rpm"
RPM_HASH = "03c26b272dad8d8163ad223655a513200343d7ab115e809dcd526b8b8b61b44d5203224978d24288c4a2d508dc29da798b6075698b52a164a381be72d3c468d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httpbin \
python3.11dist-httpbin \
python311-httpbin \
python3dist-httpbin"

RDEPENDS:${PN} += "python-abi \
python311-Brotli \
python311-Flask \
python311-MarkupSafe \
python311-Werkzeug \
python311-decorator \
python311-flasgger \
python311-gevent \
python311-itsdangerous \
python311-six"

inherit rpm
