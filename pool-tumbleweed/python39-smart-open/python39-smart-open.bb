SUMMARY = "Python utils for streaming large files"
DESCRIPTION = "Python utils for streaming large files. \
Includes support for S3, HDFS, gzip, bz2, etc."
LICENSE = "MIT"

PV = "6.3.0"

RPM_NAME = "python39-smart-open-6.3.0-1.5.noarch.rpm"
RPM_HASH = "84852f65775c42ab13789209714dbd82e8e9bcd60e54fda0a845fd29f93cc7e5424aff657eb075302e6c144102b0a411e2073c03e1060a5a910fc304d50149be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-smart-open \
python39-smart-open \
python3dist-smart-open"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-core \
python39-azure-storage-blob \
python39-boto3 \
python39-google-cloud-storage \
python39-requests"

inherit rpm
