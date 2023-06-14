SUMMARY = "Interactive plotting package for the Jupyter notebook"
DESCRIPTION = "Plotting system for the Jupyter notebook based on the \
interactive Jupyter widgets. \
 \
This package provides the python interface."
LICENSE = "Apache-2.0"

PV = "0.12.31"

RPM_NAME = "python310-bqplot-0.12.31-3.30.noarch.rpm"
RPM_HASH = "4e9aa3d34c709e13b06fb0a9731092f227c1725ca224fb4c204f3dbe194a78cd3b63e872e055b29aff4fbecd0568fb4f35678265fd18f7010717a5bef8f2ac90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bqplot \
python3-jupyter-bqplot \
python3.10dist-bqplot \
python310-bqplot \
python310-jupyter-bqplot \
python3dist-bqplot"

RDEPENDS:${PN} += "jupyter-bqplot-notebook \
python-abi \
python310-ipywidgets \
python310-numpy \
python310-pandas \
python310-traitlets \
python310-traittypes"

inherit rpm
