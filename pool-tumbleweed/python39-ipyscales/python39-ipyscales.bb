SUMMARY = "A widget library for scales"
DESCRIPTION = "A Jupyter/IPython widget library for scales. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python39-ipyscales-0.7.0-5.4.noarch.rpm"
RPM_HASH = "5068b698522226ff2a5771cd31e4453ebf1cbf6d393e256be6a46542bc1ca515275c9a45ea69a857291fdabfc2f64237349449d082242eaca1ae346290d84106"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipyscales \
python39-ipyscales \
python39-jupyter-ipyscales \
python3dist-ipyscales"

RDEPENDS:${PN} += "jupyter-ipyscales \
python-abi \
python39-ipywidgets \
python39-numpy"

inherit rpm
