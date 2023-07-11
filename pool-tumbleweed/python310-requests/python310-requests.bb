SUMMARY = "Python HTTP Library"
DESCRIPTION = "Requests is an HTTP library, written in Python, as an alternative \
to Python's builtin urllib2 which requires work (even \
method overrides) to perform basic tasks. \
 \
Features of Requests: \
 - GET, HEAD, POST, PUT, DELETE Requests: \
   + HTTP Header Request Attachment. \
   + Data/Params Request Attachment. \
   + Multipart File Uploads. \
   + CookieJar Support. \
   + Redirection History. \
   + Redirection Recursion Urllib Fix. \
   + Automatic Decompression of GZipped Content. \
   + Unicode URL Support. \
 - Authentication: \
   + URL + HTTP Auth Registry."
LICENSE = "Apache-2.0"

PV = "2.31.0"

RPM_NAME = "python310-requests-2.31.0-1.3.noarch.rpm"
RPM_HASH = "a09a0fb038387f6461474680d11ad1eec0205bcdc08c296d733347b91a5478e53ec4584d4fd5234e3b06efe99098fdc74fd4ced54a3f3d294f926346a4008b17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-requests \
python310-requests \
python3dist-requests"

RDEPENDS:${PN} += "ca-certificates \
python-abi \
python310 \
python310-certifi \
python310-charset-normalizer \
python310-idna \
python310-py \
python310-urllib3"

inherit rpm
