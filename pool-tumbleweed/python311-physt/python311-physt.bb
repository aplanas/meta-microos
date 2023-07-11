SUMMARY = "Python histogram library"
DESCRIPTION = "P(i/y)thon h(i/y)stograms. Inspired (and based on) numpy.histogram. \
 \
The unifies different concepts of histograms as occurring in numpy, \
pandas, matplotlib, ROOT, etc. and to create one representation that \
can be manipulated with from the data point of view and at the same \
time provides integration into IPython notebook and various plotting \
options."
LICENSE = "MIT"

PV = "0.5.3"

RPM_NAME = "python311-physt-0.5.3-1.5.noarch.rpm"
RPM_HASH = "b2e726b34d6c21e8f26139db0f8e9291b9d423dc18ce586236bb184108a7f9e7d83d7faef8f052613d2af18f056e4c55a1fb7fadb682abcebf84a0f1971f132e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-physt \
python3.11dist-physt \
python311-physt \
python3dist-physt"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-pandas"

inherit rpm
