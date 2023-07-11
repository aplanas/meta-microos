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

RPM_NAME = "python39-azure-containerregistry-1.1.0-1.2.noarch.rpm"
RPM_HASH = "4363622b91acf57a037dbdc3f7f54c9db560eb3963ebf24d4c91b1946d75d3fc17c6bef1e067065f0140d4c2f1e9165a02e0c708035b0e9a01f90b2d6d4ad2c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-containerregistry \
python39-azure-containerregistry \
python3dist-azure-containerregistry"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-isodate"

inherit rpm
