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

RPM_NAME = "python310-geventhttpclient-2.0.9-2.1.aarch64.rpm"
RPM_HASH = "5bd3dc15bee8aca813a8e72a1730c1bb38911dc09ba815aa17becfa9219344353c840268458a37f1451066ee8b86f9e07034dc6b8b69ad8649e4a9a44c299971"

RPROVIDES:${PN} += "python3.10dist-geventhttpclient \
python310-geventhttpclient \
python3dist-geventhttpclient"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-Brotli \
python310-certifi \
python310-gevent"

inherit rpm
