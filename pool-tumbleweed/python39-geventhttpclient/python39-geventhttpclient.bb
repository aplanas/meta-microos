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

RPM_NAME = "python39-geventhttpclient-2.0.9-1.1.aarch64.rpm"
RPM_HASH = "05202e0ec5765df39dbf8d2470c1988d7abbfc23a8a4853d2931e27c403a1bbc2aaa1141b68c575cb72ec61b41bf01107c9e0afabfea82ac7b1fb5c75a7c8112"

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
