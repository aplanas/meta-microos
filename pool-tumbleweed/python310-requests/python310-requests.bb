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

RPM_NAME = "python310-requests-2.30.0-1.1.noarch.rpm"
RPM_HASH = "9ed5996f479a6c4b75da684ff92b7e0e5101e046f88069ee9d9fb58f807dfd9e0f1537092594a0eceb740af8b243423b7b2bf2b35aeeb59cf993f2b33d949776"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests \
python3.10dist-requests \
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
