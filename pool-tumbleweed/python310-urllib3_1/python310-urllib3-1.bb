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

RPM_NAME = "python310-urllib3_1-1.26.16-1.3.noarch.rpm"
RPM_HASH = "3eb80a35a4da36ee1ab39ae76e7b7db3d0081a43a208ccca46e9d601b26c2b333d6dc91b48426551cf09277770f098fa53deaa87758495bcb0c8a0e4cc0c9dcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-urllib3 \
python310-urllib3 \
python310-urllib3-1 \
python3dist-urllib3"

RDEPENDS:${PN} += "ca-certificates-mozilla \
python-abi \
python310-certifi \
python310-cryptography \
python310-idna \
python310-pyOpenSSL \
python310-six"

inherit rpm
