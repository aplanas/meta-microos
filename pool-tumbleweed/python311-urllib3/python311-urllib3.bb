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

RPM_NAME = "python311-urllib3-2.0.4-2.1.noarch.rpm"
RPM_HASH = "aacdfedae10398ff289cf91b7c851f95600ab07e9651363dee929e88d0f2fd75bc30f8b6cad77b00be936796cf14a0ce5b0e9d6f93ad43ebe54d529a9c179f7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-urllib3 \
python3.11dist-urllib3 \
python311-urllib3 \
python3dist-urllib3"

RDEPENDS:${PN} += "ca-certificates-mozilla \
python-abi \
python311-certifi \
python311-cryptography \
python311-idna \
python311-pyOpenSSL"

inherit rpm
