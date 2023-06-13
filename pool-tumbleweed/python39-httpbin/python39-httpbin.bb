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

RPM_NAME = "python39-httpbin-0.7.0+git20181107.f8ec666-6.1.noarch.rpm"
RPM_HASH = "0b4c6b650e96d1b463e93b5a917c115df99d7f709a8096d38d0e4dafbe834809368de2a33b8eae54863d1370db6fbe995cf33e34574b5fb474a7dee076ae4b5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(httpbin) \
python39-httpbin \
python3dist(httpbin)"

RDEPENDS:${PN} += "python(abi) \
python39-Brotli \
python39-Flask \
python39-MarkupSafe \
python39-Werkzeug \
python39-blinker \
python39-decorator \
python39-flasgger \
python39-gevent \
python39-itsdangerous \
python39-six"

inherit rpm
