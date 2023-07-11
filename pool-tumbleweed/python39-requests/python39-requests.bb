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

RPM_NAME = "python39-requests-2.31.0-1.3.noarch.rpm"
RPM_HASH = "86164086aff01d243303d63ec4183344997f66cd58901ab502ae9bbb142209b07aa4acc4668f8a62c8b821b0e5918925ee76dfb872f4f68d30fa4e33f413acd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requests \
python39-requests \
python3dist-requests"

RDEPENDS:${PN} += "ca-certificates \
python-abi \
python39 \
python39-certifi \
python39-charset-normalizer \
python39-idna \
python39-py \
python39-urllib3"

inherit rpm
