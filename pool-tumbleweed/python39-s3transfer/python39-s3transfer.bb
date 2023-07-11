SUMMARY = "Python S3 transfer manager"
DESCRIPTION = "A transfer manager for Amazon Web Services S3"
LICENSE = "Apache-2.0"

PV = "0.6.1"

RPM_NAME = "python39-s3transfer-0.6.1-1.1.noarch.rpm"
RPM_HASH = "c16d840dd385fef5768704c2e08940af8cfba703e83bb4144abcc96adeb8679eba6b163437b908ff38799bee0e6f4038b4d89f3f5d57c72963b19e2ac6d60da1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-s3transfer \
python39-s3transfer \
python3dist-s3transfer"

RDEPENDS:${PN} += "python-abi \
python39-botocore \
python39-requests"

inherit rpm
