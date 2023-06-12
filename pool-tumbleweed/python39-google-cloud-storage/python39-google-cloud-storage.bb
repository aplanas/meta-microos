SUMMARY = "Google Cloud Storage API python client library"
DESCRIPTION = "Google Cloud Storage allows you to store data on Google \
infrastructure with very high reliability, performance and \
availability, and can be used to distribute large data objects \
to users via direct download. This package provides client to it."
LICENSE = "Apache-2.0"

PV = "2.8.0"

RPM_NAME = "python39-google-cloud-storage-2.8.0-1.2.noarch.rpm"
RPM_HASH = "8dc06fc85a39577b0dc36a71acf2f4e9aa7e1942843b34b27ad43e77846dbe34557497817f520cd71b4fc89149315d6542c4d8f131f21ca683c3f1b478efc3bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(google-cloud-storage) \
python39-google-cloud-storage \
python3dist(google-cloud-storage)"
RDEPENDS:${PN} += "python(abi) \
python39-google-api-core \
python39-google-auth \
python39-google-cloud-core \
python39-google-resumable-media \
python39-googleapis-common-protos \
python39-requests"

inherit rpm
