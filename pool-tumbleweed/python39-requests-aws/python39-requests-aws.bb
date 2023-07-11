SUMMARY = "AWS authentication for Amazon S3 for the python requests module"
DESCRIPTION = "AWS authentication for Amazon S3 for the Python 'requests' library. \
It is made to work with Python 2.7 and 3. \
At the moment, only S3 is supported."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "python39-requests-aws-0.1.8-3.13.noarch.rpm"
RPM_HASH = "342e6e85c6d6d4d464d67ceb3a7ab1e57112a488c5e0e5c7259015f7268fe78cbc1daef7a2c849319508d517a00ecbeecae86e5ce049e0d5a3dab4e312e5c775"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requests-aws \
python39-requests-aws \
python3dist-requests-aws"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
