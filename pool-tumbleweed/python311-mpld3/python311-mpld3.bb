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

RPM_NAME = "python311-mpld3-0.5.9-1.3.noarch.rpm"
RPM_HASH = "3579c9770dc3c088241cc15cd7b88e4bc5358a9437aaf48f927f54b303ce3f17756b7a83cb886954628757c0d410eb58b797dc022606f9fb74d3b49615d8e858"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mpld3) \
python311-mpld3 \
python3dist(mpld3)"

RDEPENDS:${PN} += "python(abi) \
python311-Jinja2 \
python311-matplotlib"

inherit rpm
