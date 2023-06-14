SUMMARY = "Microsoft Azure Container Registry Client Library for Python"
DESCRIPTION = "Azure Container Registry allows you to store and manage container images and \
artifacts in a private registry for all types of container deployments. \
 \
Use the client library for Azure Container Registry to: \
 \
 * List images or artifacts in a registry \
 * Obtain metadata for images and artifacts, repositories and tags \
 * Set read/write/delete properties on registry items \
 * Delete images and artifacts, repositories and tags"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-containerregistry-1.1.0-1.1.noarch.rpm"
RPM_HASH = "65eada4c9ce90e1499302e3428c4a19d930d9dafe1b47354ec20fa7ca3fcd5c69d51a39f64263dd4b520ec0bbe62d47e9283462d7014e2f91d727518ae4254b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-containerregistry \
python3.10dist-azure-containerregistry \
python310-azure-containerregistry \
python3dist-azure-containerregistry"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-isodate"

inherit rpm
