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

RPM_NAME = "python311-urllib3_1-1.26.16-1.3.noarch.rpm"
RPM_HASH = "805c8ece1d27cd81a02f2f47b8ffa7baa81319875a00ec0b366a148206652c217a5297e3d80bab80cbf75e0a0a85f4fcd6cf9fc9520ad8c33b37b5d69bf6767f"
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
