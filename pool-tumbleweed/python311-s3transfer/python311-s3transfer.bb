SUMMARY = "Python S3 transfer manager"
DESCRIPTION = "A transfer manager for Amazon Web Services S3"
LICENSE = "Apache-2.0"

PV = "0.6.1"

RPM_NAME = "python311-s3transfer-0.6.1-1.1.noarch.rpm"
RPM_HASH = "01fb0712a61f1420f173c9d44cb7275654fe751da5611d17bc0f0c22d96d437b0bea87778faf07d5619c9948c3e7288f3a54d6f4197faa5d20e0cd12a99014bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-s3transfer \
python3.11dist-s3transfer \
python311-s3transfer \
python3dist-s3transfer"

RDEPENDS:${PN} += "python-abi \
python311-botocore \
python311-requests"

inherit rpm
