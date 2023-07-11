SUMMARY = "Interactive plotting package for the Jupyter notebook"
DESCRIPTION = "Plotting system for the Jupyter notebook based on the \
interactive Jupyter widgets. \
 \
This package provides the python interface."
LICENSE = "Apache-2.0"

PV = "0.12.31"

RPM_NAME = "python311-bqplot-0.12.31-3.31.noarch.rpm"
RPM_HASH = "3f78b84bf2b0f277de5854bff3db5a092fcad5d01c994a691cc141e81d50225871999f744d02b6ac7e3728f7c19276a22f68355341cd86e379e3c57ba34d4222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bqplot \
python3-jupyter-bqplot \
python3.11dist-bqplot \
python311-bqplot \
python311-jupyter-bqplot \
python3dist-bqplot"

RDEPENDS:${PN} += "jupyter-bqplot-notebook \
python-abi \
python311-ipywidgets \
python311-numpy \
python311-pandas \
python311-traitlets \
python311-traittypes"

inherit rpm
