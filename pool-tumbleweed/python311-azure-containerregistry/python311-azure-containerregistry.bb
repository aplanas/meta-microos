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

RPM_NAME = "python311-azure-containerregistry-1.1.0-1.1.noarch.rpm"
RPM_HASH = "517f32d3eab7889449827d17634a5c98b4e7ff8273b7a904f9a6eb1480bdb86c286cd397283c9ff1784ddac0a59aa3f64601f33599e587503bcc201e4b925617"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-containerregistry) \
python311-azure-containerregistry \
python3dist(azure-containerregistry)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-core \
python311-azure-nspkg \
python311-isodate"

inherit rpm
