SUMMARY = "Minio library for Amazon S3 compatible cloud storage"
DESCRIPTION = "Minio library for Amazon S3 compatible cloud storage."
LICENSE = "Apache-2.0"

PV = "7.1.16"

RPM_NAME = "python310-minio-7.1.16-1.1.noarch.rpm"
RPM_HASH = "75a068f4f26af51102c20cad2a8b6f0a297bb5da157d28cc35b7d8ce1c53da81983040fb9b932d759cb74bb28167519d8bcfe350d5b5946a476bc053981d55e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-minio \
python310-minio \
python3dist-minio"

RDEPENDS:${PN} += "python-abi \
python310-certifi \
python310-urllib3"

inherit rpm
