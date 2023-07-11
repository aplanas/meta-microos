SUMMARY = "Colourmap plots based on the Bokeh visualisation library"
DESCRIPTION = "Colourmap plots based on the Bokeh visualisation library"
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python310-bokcolmaps-2.0.1-2.11.noarch.rpm"
RPM_HASH = "2b3f64d8867e0c50d0e9275ab4012b18de3069744bc9f7dd71b323f91d35841c451b3594f89d40175b6525724d7884bfe6214453302d58de9b086fb628e3b184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bokcolmaps \
python310-bokcolmaps \
python3dist-bokcolmaps"

RDEPENDS:${PN} += "python-abi \
python310-bokeh \
python310-numpy"

inherit rpm
