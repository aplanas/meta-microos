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

RPM_NAME = "python39-urllib3_1-1.26.16-2.1.noarch.rpm"
RPM_HASH = "f711c1536c5436061f3ec9bc055991a0fb4a339914ade1164476fccebe84602cae5129e39e2615d887127d51be45a5157ede7ad1a036bdf6079e99b0f0d92f0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-urllib3 \
python39-urllib3 \
python39-urllib3-1 \
python3dist-urllib3"

RDEPENDS:${PN} += "ca-certificates-mozilla \
python-abi \
python39-certifi \
python39-cryptography \
python39-idna \
python39-pyOpenSSL \
python39-six"

inherit rpm
