SUMMARY = "Google Cloud Storage API python client library"
DESCRIPTION = "Google Cloud Storage allows you to store data on Google \
infrastructure with very high reliability, performance and \
availability, and can be used to distribute large data objects \
to users via direct download. This package provides client to it."
LICENSE = "Apache-2.0"

PV = "2.8.0"

RPM_NAME = "python311-google-cloud-storage-2.8.0-1.4.noarch.rpm"
RPM_HASH = "9b4addaa26aafc8e2b3f74afa27f6d90ec1b292230b27b11426fc7f713dc1f1fa4ff282cff45a96ad1d5fd25b6d68e7696152e6fd0262236fe83032685a79f4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-storage \
python3.11dist-google-cloud-storage \
python311-google-cloud-storage \
python3dist-google-cloud-storage"

RDEPENDS:${PN} += "python-abi \
python311-google-api-core \
python311-google-auth \
python311-google-cloud-core \
python311-google-resumable-media \
python311-googleapis-common-protos \
python311-requests"

inherit rpm
