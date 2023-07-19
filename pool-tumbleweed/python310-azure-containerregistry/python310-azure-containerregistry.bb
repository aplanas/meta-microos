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

PV = "1.2.0"

RPM_NAME = "python310-azure-containerregistry-1.2.0-1.1.noarch.rpm"
RPM_HASH = "0f5ea1e60ecc5f10387574f729d17e0b05a6795c6e85470c8866e88d826ee74d1206e9b029d7398849f14279259d82c8f072e2a99bc57110efe72348c25d41b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-containerregistry \
python310-azure-containerregistry \
python3dist-azure-containerregistry"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-isodate"

inherit rpm
