SUMMARY = "Colourmap plots based on the Bokeh visualisation library"
DESCRIPTION = "Colourmap plots based on the Bokeh visualisation library"
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python310-bokcolmaps-2.0.1-2.9.noarch.rpm"
RPM_HASH = "e1473bb256a002809bd51193deecd2cd04898f5b4d3271459ac6bf3e614d002817e7bc844055059fd7701aaab22c409efb39045d181bed2b937625b62974605d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bokcolmaps \
python3.10dist(bokcolmaps) \
python310-bokcolmaps \
python3dist(bokcolmaps)"
RDEPENDS:${PN} += "python(abi) \
python310-bokeh \
python310-numpy"

inherit rpm
