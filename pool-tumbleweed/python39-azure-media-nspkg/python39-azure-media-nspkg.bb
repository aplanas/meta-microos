SUMMARY = "Microsoft Azure Media Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Media namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.media namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-media-nspkg-1.0.0-1.11.noarch.rpm"
RPM_HASH = "f62b8d0e0c356d3f167b6b14b66841eb088588170df5a324af3d67fc411cc088da3162345e4e33106885e1069f7fad067fb4f00873b213c3328cb7929d3538b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-media-nspkg \
python39-azure-media-nspkg \
python3dist-azure-media-nspkg"

RDEPENDS:${PN} += "python-abi \
python39-azure-nspkg"

inherit rpm
