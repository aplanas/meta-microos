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

PV = "2.0.2"

RPM_NAME = "python39-urllib3-2.0.2-1.1.noarch.rpm"
RPM_HASH = "65999a497ed15e8e815096d2e87b3faeb426cd61f80582be5d4389ca376ce47b9e98b99c9a8d9f8df87b8397df0c167165c869952db9815ed5abb4ab2c26be1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-urllib3 \
python39-urllib3 \
python3dist-urllib3"

RDEPENDS:${PN} += "ca-certificates-mozilla \
python-abi \
python39-certifi \
python39-cryptography \
python39-idna \
python39-pyOpenSSL"

inherit rpm
