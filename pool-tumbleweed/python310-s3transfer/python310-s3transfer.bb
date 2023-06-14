SUMMARY = "Python S3 transfer manager"
DESCRIPTION = "A transfer manager for Amazon Web Services S3"
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python310-s3transfer-0.6.0-3.1.noarch.rpm"
RPM_HASH = "ce8a4ea489a95d0e9ac47b82c52220a44968420b41ed7b06ce89e22c135ab4e00483caee32534d8d78b23f70474503fdfc9f1483af2755d5086aea67f07fbfba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-s3transfer \
python3.10dist-s3transfer \
python310-s3transfer \
python3dist-s3transfer"

RDEPENDS:${PN} += "python-abi \
python310-botocore \
python310-requests"

inherit rpm
