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

RPM_NAME = "python310-physt-0.5.3-1.3.noarch.rpm"
RPM_HASH = "db38373522227ad703ece73108bfd2fcac6ed3bc358f42a0f058ff2524d6c5a1653c23377d7b9084370635a5172a180a3cc2de77ba77fb38b2b3eb148d0637b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-physt \
python3.10dist(physt) \
python310-physt \
python3dist(physt)"
RDEPENDS:${PN} += "python(abi) \
python310-numpy \
python310-pandas"

inherit rpm
