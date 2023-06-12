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

RPM_NAME = "python39-mpld3-0.5.9-1.3.noarch.rpm"
RPM_HASH = "0e74bf50c5ad0e7938862a2e49847c4742b01515f58341cbbf8b74453a5c1c0006d788d2459245ea364d5918135c2a528df8d7e4847c2d608c64c5a70ee48511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mpld3) \
python39-mpld3 \
python3dist(mpld3)"
RDEPENDS:${PN} += "python(abi) \
python39-Jinja2 \
python39-matplotlib"

inherit rpm
