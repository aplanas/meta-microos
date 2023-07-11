SUMMARY = "Interactive plotting package for the Jupyter notebook"
DESCRIPTION = "Plotting system for the Jupyter notebook based on the \
interactive Jupyter widgets. \
 \
This package provides the python interface."
LICENSE = "Apache-2.0"

PV = "0.12.31"

RPM_NAME = "python39-bqplot-0.12.31-3.31.noarch.rpm"
RPM_HASH = "dd4876f030a32d213a53285dd8c7211dd274226a364ce402208b9518bc1b6b68e80dbeb5c890d408f53604f89c3f7c146c1226e09b563f977b691b95cbca13ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bqplot \
python39-bqplot \
python39-jupyter-bqplot \
python3dist-bqplot"

RDEPENDS:${PN} += "jupyter-bqplot-notebook \
python-abi \
python39-ipywidgets \
python39-numpy \
python39-pandas \
python39-traitlets \
python39-traittypes"

inherit rpm
