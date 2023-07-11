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

RPM_NAME = "python39-httpbin-0.7.0+git20181107.f8ec666-7.1.noarch.rpm"
RPM_HASH = "649c26c40fad79476befae187903bdc478ab9fae69237ba6038a335accbb780d4806be10f5c4aa6a9c13dd2f751fd29e489505bf3d01005067f6c00ad692064e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-httpbin \
python39-httpbin \
python3dist-httpbin"

RDEPENDS:${PN} += "python-abi \
python39-Brotli \
python39-Flask \
python39-MarkupSafe \
python39-Werkzeug \
python39-decorator \
python39-flasgger \
python39-gevent \
python39-itsdangerous \
python39-six"

inherit rpm
