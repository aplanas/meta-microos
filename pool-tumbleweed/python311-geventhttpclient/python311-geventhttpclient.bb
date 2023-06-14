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

RPM_NAME = "python311-geventhttpclient-2.0.9-1.1.aarch64.rpm"
RPM_HASH = "d6f1c30d195791f9d827cf988837ce45f4d317f814f0d0782403051ba8aa6fdb444c7e265711ed75dadb0678412db76ead197e149518ba73dff4b1d2b1d42dd1"

RPROVIDES:${PN} += "python3.11dist-geventhttpclient \
python311-geventhttpclient \
python3dist-geventhttpclient"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-Brotli \
python311-certifi \
python311-gevent"

inherit rpm
