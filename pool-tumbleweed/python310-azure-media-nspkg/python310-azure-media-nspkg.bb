SUMMARY = "Microsoft Azure Media Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Media namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.media namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-media-nspkg-1.0.0-1.10.noarch.rpm"
RPM_HASH = "77620bd5ac4f5ee6b92fbe7368c8e91b0ba0ca8f1804291d93f8cb99f36631f3808acfc21246f830b68ef9cdd3bedeffb37c5d40d7de5c49be276e39312e26d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-media-nspkg \
python3.10dist(azure-media-nspkg) \
python310-azure-media-nspkg \
python3dist(azure-media-nspkg)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-nspkg"

inherit rpm
