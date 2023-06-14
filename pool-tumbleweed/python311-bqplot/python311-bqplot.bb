SUMMARY = "Interactive plotting package for the Jupyter notebook"
DESCRIPTION = "Plotting system for the Jupyter notebook based on the \
interactive Jupyter widgets. \
 \
This package provides the python interface."
LICENSE = "Apache-2.0"

PV = "0.12.31"

RPM_NAME = "python311-bqplot-0.12.31-3.30.noarch.rpm"
RPM_HASH = "e37bed40976a1272a55999fae82ff1d1c3017683916dbb5d0fa00fef7dac95038b3a07ac2fb61946d26d4b380ce23975046439489fcb7d18809450d7a7cac169"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-bqplot \
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
