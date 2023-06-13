SUMMARY = "Python S3 transfer manager"
DESCRIPTION = "A transfer manager for Amazon Web Services S3"
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python39-s3transfer-0.6.0-3.1.noarch.rpm"
RPM_HASH = "aea90dbfa9e592f7c4a51688761714f52df625ca6e4931a37d34690e7c281a33168cb5fd0208a02dd59520e260f2b5ef25b04201842cad4198887ea892d8846d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(s3transfer) \
python39-s3transfer \
python3dist(s3transfer)"

RDEPENDS:${PN} += "python(abi) \
python39-botocore \
python39-requests"

inherit rpm
