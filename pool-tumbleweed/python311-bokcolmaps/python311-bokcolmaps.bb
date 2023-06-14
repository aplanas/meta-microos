SUMMARY = "Colourmap plots based on the Bokeh visualisation library"
DESCRIPTION = "Colourmap plots based on the Bokeh visualisation library"
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python311-bokcolmaps-2.0.1-2.9.noarch.rpm"
RPM_HASH = "e8b9a79c888d8a6baf498b49c0eb5bcd0ba5ca1119fa45a29b34ed727e9efe8547ffc41b58c9a41e57a8991f06d4bc4b1e375e99a61c37963490caeaabe9087b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-bokcolmaps \
python311-bokcolmaps \
python3dist-bokcolmaps"

RDEPENDS:${PN} += "python-abi \
python311-bokeh \
python311-numpy"

inherit rpm
