SUMMARY = "D3 Viewer for Matplotlib"
DESCRIPTION = "This is an interactive D3js-based viewer which brings matplotlib graphics to the browser. \
Please visit http://mpld3.github.io for documentation and examples. \
 \
mpld3 provides a custom stand-alone javascript library built on D3, which \
parses JSON representations of plots.  The mpld3 python module provides a \
set of routines which parses matplotlib plots (using the mplexporter \
framework) and outputs the JSON description readable by mpld3.js."
LICENSE = "BSD-3-Clause"

PV = "0.5.9"

RPM_NAME = "python39-mpld3-0.5.9-1.5.noarch.rpm"
RPM_HASH = "08d1fb88f1516315b1c55ae0f78f333c1952c5b7ca0a453357b1351b208fca201e7030cfbae3f9a1b164d4c7236f30414312240eb2c2ae04fb6c79530ede6bbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mpld3 \
python39-mpld3 \
python3dist-mpld3"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2 \
python39-matplotlib"

inherit rpm
