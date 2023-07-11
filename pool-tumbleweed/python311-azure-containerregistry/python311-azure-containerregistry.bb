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

RPM_NAME = "python311-azure-containerregistry-1.1.0-1.2.noarch.rpm"
RPM_HASH = "0ae794b85f65b3221120af9260f4ed0264307bb4ce204d66e84e54042be5b7c2bb116c3c91481a7e6c852c404ded5fd0326033e6b041b0fe66cca9d034bfce08"
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
