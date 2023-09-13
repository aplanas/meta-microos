SUMMARY = "Python S3 transfer manager"
DESCRIPTION = "A transfer manager for Amazon Web Services S3"
LICENSE = "Apache-2.0"

PV = "0.6.2"

RPM_NAME = "python310-s3transfer-0.6.2-1.1.noarch.rpm"
RPM_HASH = "04e275c818b5f46705ee850f8e6ce1eddcdee7ee199eb61a6fd2bc1344055b5eb1c8bb981abfb7209822c344eabf5a3d48ddd3ab4ae2d3950a35b5e48c77c5b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-s3transfer \
python310-s3transfer \
python3dist-s3transfer"

RDEPENDS:${PN} += "python-abi \
python310-botocore \
python310-requests"

inherit rpm
