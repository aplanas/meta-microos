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

RPM_NAME = "python310-geventhttpclient-2.0.9-1.3.aarch64.rpm"
RPM_HASH = "bbd0a2e33a7e9e33c0c1bcf49fa7b22299cd3c100b3cd1e9a25e385de359efc95c85baccda57a6ee8cdf9fa2d20aa951696190406e71a331171ccdc554abedb4"

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
