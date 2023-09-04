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

RPM_NAME = "python311-geventhttpclient-2.0.9-2.1.aarch64.rpm"
RPM_HASH = "277e7c23cdc2950142df142e7c6daafda07dd464e46b3279918099bd5449aae7bff42bc68a74dc29b88b58c35978fba79374f12c2fea2b570820429490cb2a3e"

RPROVIDES:${PN} += "python3-geventhttpclient \
python3.11dist-geventhttpclient \
python311-geventhttpclient \
python3dist-geventhttpclient"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-Brotli \
python311-certifi \
python311-gevent"

inherit rpm
