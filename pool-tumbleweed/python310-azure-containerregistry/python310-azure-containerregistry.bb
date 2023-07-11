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

RPM_NAME = "python310-azure-containerregistry-1.1.0-1.2.noarch.rpm"
RPM_HASH = "09674d3cfb24cd9304a3448b2a856c91b6f25ef1509dcaac0c08d12766c0a8053f10f1cd67d409ed98cf369fe594d46c4c9bc782e46e9a0bdf6400b1da4eb795"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-containerregistry \
python310-azure-containerregistry \
python3dist-azure-containerregistry"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-isodate"

inherit rpm
