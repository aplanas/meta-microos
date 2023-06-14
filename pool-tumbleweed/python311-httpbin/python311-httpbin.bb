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

RPM_NAME = "python311-httpbin-0.7.0+git20181107.f8ec666-6.1.noarch.rpm"
RPM_HASH = "d328cb70a4c797465b1b493469bba44df15e5677fe126bca68a851e84fdd7177ef9598e038941291be17676e52fcc30138ce4c4fac5ffe7cea8c7e323bdff0a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-httpbin \
python311-httpbin \
python3dist-httpbin"

RDEPENDS:${PN} += "python-abi \
python311-Brotli \
python311-Flask \
python311-MarkupSafe \
python311-Werkzeug \
python311-blinker \
python311-decorator \
python311-flasgger \
python311-gevent \
python311-itsdangerous \
python311-six"

inherit rpm
