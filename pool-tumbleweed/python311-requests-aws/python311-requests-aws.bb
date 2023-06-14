SUMMARY = "AWS authentication for Amazon S3 for the python requests module"
DESCRIPTION = "AWS authentication for Amazon S3 for the Python 'requests' library. \
It is made to work with Python 2.7 and 3. \
At the moment, only S3 is supported."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "python311-requests-aws-0.1.8-3.11.noarch.rpm"
RPM_HASH = "1197b0de53b512c017640169010db830a8053d03f33ce6b9b7fd67c586a4b7e2a6c8d4f128b4de2b10817fd5e6ef2361c30fb1c82656da6768e8ca3b40e46578"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-requests-aws \
python311-requests-aws \
python3dist-requests-aws"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
