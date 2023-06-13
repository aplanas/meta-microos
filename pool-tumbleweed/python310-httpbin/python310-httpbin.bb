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

RPM_NAME = "python310-httpbin-0.7.0+git20181107.f8ec666-6.1.noarch.rpm"
RPM_HASH = "602df21f5b19941c43625a4f47fee00ca57c45729cdc2fdf6aff54fc13543615476287b223f6cf807152d68e267f33650816edf77888a34695e509b873b118ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httpbin \
python3.10dist(httpbin) \
python310-httpbin \
python3dist(httpbin)"

RDEPENDS:${PN} += "python(abi) \
python310-Brotli \
python310-Flask \
python310-MarkupSafe \
python310-Werkzeug \
python310-blinker \
python310-decorator \
python310-flasgger \
python310-gevent \
python310-itsdangerous \
python310-six"

inherit rpm
