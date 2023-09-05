SUMMARY = "Minio library for Amazon S3 compatible cloud storage"
DESCRIPTION = "Minio library for Amazon S3 compatible cloud storage."
LICENSE = "Apache-2.0"

PV = "7.1.16"

RPM_NAME = "python311-minio-7.1.16-1.1.noarch.rpm"
RPM_HASH = "684ecc77cdf421434b88bc922e83f8077ab3e02530f261bac262e5af37e8be766949cb67f0bad6e71a4c90176ce319f70ae2f937750d49d0a1aaa2bdc3b7f751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-minio \
python3.11dist-minio \
python311-minio \
python3dist-minio"

RDEPENDS:${PN} += "python-abi \
python311-certifi \
python311-urllib3"

inherit rpm
