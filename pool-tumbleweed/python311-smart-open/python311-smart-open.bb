SUMMARY = "Python utils for streaming large files"
DESCRIPTION = "Python utils for streaming large files. \
Includes support for S3, HDFS, gzip, bz2, etc."
LICENSE = "MIT"

PV = "6.3.0"

RPM_NAME = "python311-smart-open-6.3.0-1.5.noarch.rpm"
RPM_HASH = "bc32c7024a01bdab0ef3e772504c304e1d79879cf22d43879d5700014f8b881f1caee934eff8f0e15b30f9cffba9241de404498864eb15ab5841e108ceccf142"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-smart-open \
python3.11dist-smart-open \
python311-smart-open \
python3dist-smart-open"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-core \
python311-azure-storage-blob \
python311-boto3 \
python311-google-cloud-storage \
python311-requests"

inherit rpm
