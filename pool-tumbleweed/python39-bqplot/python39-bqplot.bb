SUMMARY = "Interactive plotting package for the Jupyter notebook"
DESCRIPTION = "Plotting system for the Jupyter notebook based on the \
interactive Jupyter widgets. \
 \
This package provides the python interface."
LICENSE = "Apache-2.0"

PV = "0.12.31"

RPM_NAME = "python39-bqplot-0.12.31-3.30.noarch.rpm"
RPM_HASH = "466b58916d7e27bf8ea6c5ffabbcec3f22e34b130145cbdc08c3faa8ee799edb3a642f58b614ceec26c4b8c39a9da3fe53abce0d1d2862ebf3600b942b2a2323"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(bqplot) \
python39-bqplot \
python39-jupyter_bqplot \
python3dist(bqplot)"
RDEPENDS:${PN} += "jupyter-bqplot-notebook \
python(abi) \
python39-ipywidgets \
python39-numpy \
python39-pandas \
python39-traitlets \
python39-traittypes"

inherit rpm
