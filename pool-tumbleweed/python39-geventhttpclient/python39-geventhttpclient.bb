SUMMARY = "HTTP client library for gevent"
DESCRIPTION = "A concurrent HTTP client library for Python using gevent. \
 \
geventhttpclient uses a HTTP parser, written in C, originating from \
nginx, extracted and modified by Joyent. \
 \
geventhttpclient has been designed for high concurrency and \
streaming, and supports HTTP/1.1 persistent connections. More \
generally, it is designed for pulling from REST APIs and streaming \
APIs like Twitter's."
LICENSE = "MIT"

PV = "2.0.9"

RPM_NAME = "python39-geventhttpclient-2.0.9-2.1.aarch64.rpm"
RPM_HASH = "82d3e095183f2ca2d03600aa44d7bc764aad93fa3f0cf6d50bb8809e5f11789d5eaa1ce75b98959017762bf5f8ff7ebdd706cf4a47c868925f68a44d35d48296"

RPROVIDES:${PN} += "python3.9dist-geventhttpclient \
python39-geventhttpclient \
python3dist-geventhttpclient"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-Brotli \
python39-certifi \
python39-gevent"

inherit rpm
