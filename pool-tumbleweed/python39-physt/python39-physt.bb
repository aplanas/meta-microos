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

RPM_NAME = "python39-physt-0.5.3-1.5.noarch.rpm"
RPM_HASH = "c1f5f25a6be00ca84ade307c56bad6a25171b195e197e52ddba7156ef1701b66fd829be604085d111c2c02bcd810696f22c20f08e4ca6488adad6e5d54120ca9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-physt \
python39-physt \
python3dist-physt"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-pandas"

inherit rpm
