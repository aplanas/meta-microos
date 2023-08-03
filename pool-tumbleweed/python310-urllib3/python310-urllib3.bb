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

PV = "2.0.4"

RPM_NAME = "python310-urllib3-2.0.4-1.1.noarch.rpm"
RPM_HASH = "efd42668807f5f99a0e48c9bb6d64a2128c98caaf822117c2c9eb4bdfebb37cb8433d414d0137ed739334f74b539471e76ce6d54b3e4c32433c01f7ff0b36dc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-urllib3 \
python310-urllib3 \
python3dist-urllib3"

RDEPENDS:${PN} += "ca-certificates-mozilla \
python-abi \
python310-certifi \
python310-cryptography \
python310-idna \
python310-pyOpenSSL"

inherit rpm
