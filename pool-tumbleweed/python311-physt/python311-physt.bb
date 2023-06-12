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

RPM_NAME = "python311-physt-0.5.3-1.3.noarch.rpm"
RPM_HASH = "f7d6abeeca2386baf8c4d576b7c286fb5980bc8abd66740f8b362ce68f4b52e796bc588bb4eda496e255c8687da38219bcd036af9633e9554b3901095bcbb73b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(physt) \
python311-physt \
python3dist(physt)"
RDEPENDS:${PN} += "python(abi) \
python311-numpy \
python311-pandas"

inherit rpm
