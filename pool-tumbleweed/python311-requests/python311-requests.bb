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

PV = "2.30.0"

RPM_NAME = "python311-requests-2.30.0-1.1.noarch.rpm"
RPM_HASH = "6d849e02a90962fe0922df840cf1703ac46843217c27c20dc981c6c9ab5f977b4a611735910b33c0880c010c6b3c9e58a0ffc62e65d5352522f0559c47923873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(requests) \
python311-requests \
python3dist(requests)"

RDEPENDS:${PN} += "ca-certificates \
python(abi) \
python311 \
python311-certifi \
python311-charset-normalizer \
python311-idna \
python311-py \
python311-urllib3"

inherit rpm
