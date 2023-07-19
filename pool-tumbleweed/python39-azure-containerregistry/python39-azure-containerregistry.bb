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

RPM_NAME = "python39-azure-containerregistry-1.2.0-1.1.noarch.rpm"
RPM_HASH = "611af45f69f765a85573a52fb50ef5581e5e60e7a040171fb725d9fef45011a328e1d1715fa133890a2494967e7a61c1eafa164caba1966d044289c70d377c06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-containerregistry \
python39-azure-containerregistry \
python3dist-azure-containerregistry"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-isodate"

inherit rpm
