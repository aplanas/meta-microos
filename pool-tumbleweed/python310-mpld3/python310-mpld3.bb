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

RPM_NAME = "python310-mpld3-0.5.9-1.5.noarch.rpm"
RPM_HASH = "9f9a1ea93233f20309c58eb57987e0ce8a52f57ec78d0d716e43aa2b9cbb32cfd383f9fc5496f38705bbba3b98cc1578cbcfcb3d088e59b5c7213b248814c020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mpld3 \
python310-mpld3 \
python3dist-mpld3"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-matplotlib"

inherit rpm
