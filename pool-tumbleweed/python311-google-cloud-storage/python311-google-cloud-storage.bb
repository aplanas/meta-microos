SUMMARY = "Google Cloud Storage API python client library"
DESCRIPTION = "Google Cloud Storage allows you to store data on Google \
infrastructure with very high reliability, performance and \
availability, and can be used to distribute large data objects \
to users via direct download. This package provides client to it."
LICENSE = "Apache-2.0"

PV = "2.8.0"

RPM_NAME = "python311-google-cloud-storage-2.8.0-1.2.noarch.rpm"
RPM_HASH = "bdb5de217d29ddc233b7ced7ca3f0fe74c51e05ce1405d41f09443f8d6214035e3015710d8aa8f98319b819f1fe476542dd061804ee87eec377ec54064397638"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(google-cloud-storage) \
python311-google-cloud-storage \
python3dist(google-cloud-storage)"
RDEPENDS:${PN} += "python(abi) \
python311-google-api-core \
python311-google-auth \
python311-google-cloud-core \
python311-google-resumable-media \
python311-googleapis-common-protos \
python311-requests"

inherit rpm
