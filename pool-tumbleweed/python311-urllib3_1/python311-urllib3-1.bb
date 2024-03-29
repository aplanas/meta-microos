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

RPM_NAME = "python311-urllib3_1-1.26.16-2.1.noarch.rpm"
RPM_HASH = "4cf71e1a3a742d7d7d634db976fc25a6b1310ec1fa0a9b03e2544ac1368a5bab77a6855b6b4a036bcd9039d1879e263afd9abdc4f307ff3096c445d50b1c1ccf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-urllib3 \
python3-urllib3-1 \
python3.11dist-urllib3 \
python311-urllib3 \
python311-urllib3-1 \
python3dist-urllib3"

RDEPENDS:${PN} += "ca-certificates-mozilla \
python-abi \
python311-certifi \
python311-cryptography \
python311-idna \
python311-pyOpenSSL \
python311-six"

inherit rpm
