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

RPM_NAME = "python311-geventhttpclient-2.0.9-1.3.aarch64.rpm"
RPM_HASH = "a0683d98c4ceb94a7699e2e0faaf7daa1ee4974dbb44603bbebd42c064058b9845fe9e9f6b8d49f045971d0ad5083aaa7a38d882e5a81bb1dc09401e84de4313"

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
