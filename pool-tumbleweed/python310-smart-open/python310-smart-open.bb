SUMMARY = "Python utils for streaming large files"
DESCRIPTION = "Python utils for streaming large files. \
Includes support for S3, HDFS, gzip, bz2, etc."
LICENSE = "MIT"

PV = "6.3.0"

RPM_NAME = "python310-smart-open-6.3.0-1.5.noarch.rpm"
RPM_HASH = "d2a1367f92f89b8dfba2dfffc08c369de5a311a813e6f6b53c178a9cff35477bf4cb44ce3f1c1dafc1130def008f64edb36f361a33aad83530c0b58e90aa310d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-smart-open \
python310-smart-open \
python3dist-smart-open"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-core \
python310-azure-storage-blob \
python310-boto3 \
python310-google-cloud-storage \
python310-requests"

inherit rpm
