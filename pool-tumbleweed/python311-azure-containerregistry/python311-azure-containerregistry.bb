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

RPM_NAME = "python311-azure-containerregistry-1.2.0-1.1.noarch.rpm"
RPM_HASH = "afc8cd1362b745aca24e95d96d140f0bfe8251ab0947f1e13a5a551218c7e948bcb5f6c79f5ba29891a7f3174777f89ef4382edc3bb12b4be56556a6df175712"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-containerregistry \
python3.11dist-azure-containerregistry \
python311-azure-containerregistry \
python3dist-azure-containerregistry"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-isodate"

inherit rpm
