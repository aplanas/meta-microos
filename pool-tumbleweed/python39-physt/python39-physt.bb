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

RPM_NAME = "python39-physt-0.5.3-1.3.noarch.rpm"
RPM_HASH = "4ca37f4cd8411bf37261789b02a93df4da1809fc00a1b1c17a08118f1772bc5b210f1c1c04c84710771b869ef0cd52578e2bed641482fc028bdf3041873fa1fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(physt) \
python39-physt \
python3dist(physt)"

RDEPENDS:${PN} += "python(abi) \
python39-numpy \
python39-pandas"

inherit rpm
