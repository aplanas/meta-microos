SUMMARY = "Interactive plotting package for Jupyter Notebooke"
DESCRIPTION = "Plotting system for the Jupyter notebook based on the \
interactive Jupyter widgets. \
 \
This package provides the jupyter notebook extension."
LICENSE = "Apache-2.0"

PV = "0.5.32"

RPM_NAME = "jupyter-bqplot-notebook-0.5.32-3.31.noarch.rpm"
RPM_HASH = "5689150cec52b7dc53e4efcaea9072ef74d750c0f16b0040122fb6509fb4a22dfadd9a7e78b162454de40d823b8baa685c3a7ce0a60cdaffe00e08e6e2b7af3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-bqplot \
jupyter-bqplot-notebook"

RDEPENDS:${PN} += "jupyter-notebook \
python3-bqplot"

inherit rpm
