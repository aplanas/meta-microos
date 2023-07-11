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

RPM_NAME = "python311-mpld3-0.5.9-1.5.noarch.rpm"
RPM_HASH = "622d112b16c644ae2d18586943c4182ef48dbfb7b07c12a1c131ef32e1f8ea7bdd53ee27f7f26f57fb77fa37098184905156a1f9b9e8922bdc1f751107b4b4d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mpld3 \
python3.11dist-mpld3 \
python311-mpld3 \
python3dist-mpld3"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-matplotlib"

inherit rpm
