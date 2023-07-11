SUMMARY = "Google Cloud Storage API python client library"
DESCRIPTION = "Google Cloud Storage allows you to store data on Google \
infrastructure with very high reliability, performance and \
availability, and can be used to distribute large data objects \
to users via direct download. This package provides client to it."
LICENSE = "Apache-2.0"

PV = "2.8.0"

RPM_NAME = "python39-google-cloud-storage-2.8.0-1.4.noarch.rpm"
RPM_HASH = "e07441f74634452df8cded5c8f75506f0f7f86cbc5492a9959843cce8e993a4cc9558eb4121b75c6ce6fa414c991528ec0d790d928391f8aeb94306701e9817f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-google-cloud-storage \
python39-google-cloud-storage \
python3dist-google-cloud-storage"

RDEPENDS:${PN} += "python-abi \
python39-google-api-core \
python39-google-auth \
python39-google-cloud-core \
python39-google-resumable-media \
python39-googleapis-common-protos \
python39-requests"

inherit rpm
