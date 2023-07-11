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

RPM_NAME = "python310-physt-0.5.3-1.5.noarch.rpm"
RPM_HASH = "c33473aa80ca17c8d88ec98abff41349f8bc62d327aefea2bca5e95071fc2d9e9494babf57ed71c3c569a910d38b36a990868cada7cb2605b33eab34d31a75dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-physt \
python310-physt \
python3dist-physt"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-pandas"

inherit rpm
