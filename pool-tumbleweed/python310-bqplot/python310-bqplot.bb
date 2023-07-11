SUMMARY = "Interactive plotting package for the Jupyter notebook"
DESCRIPTION = "Plotting system for the Jupyter notebook based on the \
interactive Jupyter widgets. \
 \
This package provides the python interface."
LICENSE = "Apache-2.0"

PV = "0.12.31"

RPM_NAME = "python310-bqplot-0.12.31-3.31.noarch.rpm"
RPM_HASH = "255f19045beb780f5c06a4177bdf6eb084f60f8f5c0eb67bc4e132a376caf695fa487f6e3627acd7e2017fbccfad1b6dc51bcf31e2e0f0315f7d483d338a3daf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bqplot \
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
