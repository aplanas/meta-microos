SUMMARY = "HTTP library with thread-safe connection pooling, file post, and more"
DESCRIPTION = "Highlights \
 \
- Re-use the same socket connection for multiple requests \
  (HTTPConnectionPool and HTTPSConnectionPool) \
  (with optional client-side certificate verification). \
- File posting (encode_multipart_formdata). \
- Built-in redirection and retries (optional). \
- Supports gzip and deflate decoding. \
- Thread-safe and sanity-safe. \
- Works with AppEngine, gevent, and eventlib. \
- Tested on Python 2.6+ and Python 3.3+, 100% unit test coverage. \
- Small and easy to understand codebase perfect for extending and building upon. \
  For a more comprehensive solution, have a look at \
  Requests which is also powered by urllib3."
LICENSE = "MIT"

PV = "1.26.16"

RPM_NAME = "python310-urllib3_1-1.26.16-1.1.noarch.rpm"
RPM_HASH = "c39a5cca55bccb868d0e97feabea55c90b9384717aa77c63fbb91f6f325988f91bb2dce2390e4ecc9a26c49c2e530cc445457ec718f168ec5ac417c2137031c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-urllib3 \
python3-urllib3_1 \
python3.10dist(urllib3) \
python310-urllib3 \
python310-urllib3_1 \
python3dist(urllib3)"
RDEPENDS:${PN} += "ca-certificates-mozilla \
python(abi) \
python310-certifi \
python310-cryptography \
python310-idna \
python310-pyOpenSSL \
python310-six"

inherit rpm
