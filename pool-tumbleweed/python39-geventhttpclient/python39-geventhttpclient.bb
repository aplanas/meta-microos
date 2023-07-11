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

RPM_NAME = "python39-geventhttpclient-2.0.9-1.3.aarch64.rpm"
RPM_HASH = "21d1362ba4eac53310a16a1fc0b8723cca0d4b7aa250c2507c501c1ad1407c5d32e1db9285bbdd703aed31b53bfb08875a285722eade97c85211b74500d7a5d1"

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
