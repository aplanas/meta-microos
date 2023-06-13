SUMMARY = "Interactive plotting package for Jupyter Notebooke"
DESCRIPTION = "Plotting system for the Jupyter notebook based on the \
interactive Jupyter widgets. \
 \
This package provides the jupyter notebook extension."
LICENSE = "Apache-2.0"

PV = "0.5.32"

RPM_NAME = "jupyter-bqplot-notebook-0.5.32-3.30.noarch.rpm"
RPM_HASH = "b61080a7741971e6d45b9813b3df4d6457c2f6c8f0cd49e302b134363420f80c395cbab4164787be1570f9c34b2ab76cadf48e8ebdfb831baf71583b3441fbe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-bqplot \
jupyter-bqplot-notebook"

RDEPENDS:${PN} += "jupyter-notebook \
python3-bqplot"

inherit rpm
