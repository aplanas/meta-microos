SUMMARY = "Interactive plotting package for Jupyterlab"
DESCRIPTION = "Plotting system for the Jupyter notebook based on the \
interactive Jupyter widgets. \
 \
This package provides the jupyterlab extension."
LICENSE = "Apache-2.0"

PV = "0.5.32"

RPM_NAME = "jupyter-bqplot-jupyterlab-0.5.32-3.31.noarch.rpm"
RPM_HASH = "afefd19604b6fa157869d07b3d381a5d662eec41a7e58d3524d541a7264fb44d1dfdb9e25e4f7087b955dc19d5c1d2cb21eaf3141c1cf99431db7b09a16119d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-bqplot-jupyterlab"

RDEPENDS:${PN} += "jupyter-bqplot-notebook \
jupyter-jupyterlab"

inherit rpm
