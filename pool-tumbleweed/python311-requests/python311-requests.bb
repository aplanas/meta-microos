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

RPM_NAME = "python311-requests-2.31.0-1.3.noarch.rpm"
RPM_HASH = "49ce021b9c8b22c45037ad668666672325f1e9e2ce2a6b041fa136ee78ee54afdadac1aaca513186b0daceaa8295c0fe64239bc8cb43b7696a94299bed2fa8af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests \
python3.11dist-requests \
python311-requests \
python3dist-requests"

RDEPENDS:${PN} += "ca-certificates \
python-abi \
python311 \
python311-certifi \
python311-charset-normalizer \
python311-idna \
python311-py \
python311-urllib3"

inherit rpm
