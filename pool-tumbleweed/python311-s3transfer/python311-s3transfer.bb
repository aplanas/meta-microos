SUMMARY = "Python S3 transfer manager"
DESCRIPTION = "A transfer manager for Amazon Web Services S3"
LICENSE = "Apache-2.0"

PV = "0.6.2"

RPM_NAME = "python311-s3transfer-0.6.2-1.1.noarch.rpm"
RPM_HASH = "ce734fd666e9c5c77fea185e18b96c0370dc9faa66030ab1d76732071e0a4211b926ef748b15258052e64a6724739fc5de14ef6365e6f7f9d19e0a2065c467a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-s3transfer \
python3.11dist-s3transfer \
python311-s3transfer \
python3dist-s3transfer"

RDEPENDS:${PN} += "python-abi \
python311-botocore \
python311-requests"

inherit rpm
