SUMMARY = "Colourmap plots based on the Bokeh visualisation library"
DESCRIPTION = "Colourmap plots based on the Bokeh visualisation library"
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python39-bokcolmaps-2.0.1-2.11.noarch.rpm"
RPM_HASH = "1602c0d14874871ecbf8d4fe12a79525d7ae4aa2167dc809d57cb5d334a02ccfb6f289117d887f5664900ee2f39f5dc320d80aa878ebc27452beeb20cef80f0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bokcolmaps \
python39-bokcolmaps \
python3dist-bokcolmaps"

RDEPENDS:${PN} += "python-abi \
python39-bokeh \
python39-numpy"

inherit rpm
