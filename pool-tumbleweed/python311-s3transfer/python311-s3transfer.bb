SUMMARY = "Python S3 transfer manager"
DESCRIPTION = "A transfer manager for Amazon Web Services S3"
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python311-s3transfer-0.6.0-3.1.noarch.rpm"
RPM_HASH = "6275738f2ee902118838d43a5a020b42c9e2bf34694020b7fb93d1f5b917414650d47f2760a1568133f203bd494e3ce50a066619aae204b145e31e8447facf12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-s3transfer \
python311-s3transfer \
python3dist-s3transfer"

RDEPENDS:${PN} += "python-abi \
python311-botocore \
python311-requests"

inherit rpm
