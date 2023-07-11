SUMMARY = "Colourmap plots based on the Bokeh visualisation library"
DESCRIPTION = "Colourmap plots based on the Bokeh visualisation library"
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python311-bokcolmaps-2.0.1-2.11.noarch.rpm"
RPM_HASH = "89c240c1d36fefeb8d82e9f817c7abf2057ba37b5931f84991cead076f505671b81a01bc67fec068e18e50ff82c83d4bd3e956848fb3126e191c9a18a2c9dd19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bokcolmaps \
python3.11dist-bokcolmaps \
python311-bokcolmaps \
python3dist-bokcolmaps"

RDEPENDS:${PN} += "python-abi \
python311-bokeh \
python311-numpy"

inherit rpm
