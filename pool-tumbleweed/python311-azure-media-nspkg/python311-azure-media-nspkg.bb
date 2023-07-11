SUMMARY = "Microsoft Azure Media Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Media namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.media namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-media-nspkg-1.0.0-1.11.noarch.rpm"
RPM_HASH = "97f2f19a435902f2854c1a8e30b04bf034df00fd90a176f00f5c827be28a03f36de6293cf21fc809fafb7d24294528c76a77ae3b5852fbb346ac328ff310e448"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-media-nspkg \
python3.11dist-azure-media-nspkg \
python311-azure-media-nspkg \
python3dist-azure-media-nspkg"

RDEPENDS:${PN} += "python-abi \
python311-azure-nspkg"

inherit rpm
