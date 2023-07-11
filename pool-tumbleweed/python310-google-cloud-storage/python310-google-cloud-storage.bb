SUMMARY = "Google Cloud Storage API python client library"
DESCRIPTION = "Google Cloud Storage allows you to store data on Google \
infrastructure with very high reliability, performance and \
availability, and can be used to distribute large data objects \
to users via direct download. This package provides client to it."
LICENSE = "Apache-2.0"

PV = "2.8.0"

RPM_NAME = "python310-google-cloud-storage-2.8.0-1.4.noarch.rpm"
RPM_HASH = "f3d09d1047ee05372a51a1d9b664fc40d387caeb9be08399ba9622b23dedbcd84c666a5c5cd9eb07b7da9554a1e54d1c784519b21a35225163543b4aa063ce4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-google-cloud-storage \
python310-google-cloud-storage \
python3dist-google-cloud-storage"

RDEPENDS:${PN} += "python-abi \
python310-google-api-core \
python310-google-auth \
python310-google-cloud-core \
python310-google-resumable-media \
python310-googleapis-common-protos \
python310-requests"

inherit rpm
