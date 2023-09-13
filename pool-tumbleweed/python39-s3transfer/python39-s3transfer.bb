SUMMARY = "Python S3 transfer manager"
DESCRIPTION = "A transfer manager for Amazon Web Services S3"
LICENSE = "Apache-2.0"

PV = "0.6.2"

RPM_NAME = "python39-s3transfer-0.6.2-1.1.noarch.rpm"
RPM_HASH = "5f740fccdd5b87d1bb0810f28da905fdb4bf047ffb5f386e3a4ae9c69efc02bee64cd15c7cc5da15b05b647fcb9bddec8e7e849994f718dac0636479d7d40cef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-s3transfer \
python39-s3transfer \
python3dist-s3transfer"

RDEPENDS:${PN} += "python-abi \
python39-botocore \
python39-requests"

inherit rpm
