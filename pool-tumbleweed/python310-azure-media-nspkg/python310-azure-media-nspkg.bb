SUMMARY = "Microsoft Azure Media Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Media namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.media namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-media-nspkg-1.0.0-1.11.noarch.rpm"
RPM_HASH = "eac046bce0a0b244d5cfdb577a26b0dcbc0df067b1c75a3aef1a08c3000568270932feaf0be821ea13efdf45db362b76150f5c8ed941b8e91115d0fd972bde3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-media-nspkg \
python310-azure-media-nspkg \
python3dist-azure-media-nspkg"

RDEPENDS:${PN} += "python-abi \
python310-azure-nspkg"

inherit rpm
