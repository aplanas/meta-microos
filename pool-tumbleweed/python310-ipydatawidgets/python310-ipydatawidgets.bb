SUMMARY = "Jupyter widgets to help facilitate reuse of large datasets"
DESCRIPTION = "IPydatawidgets is a set of widgets to help facilitate reuse of large \
datasets across different widgets, and different packages. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "4.3.2"

RPM_NAME = "python310-ipydatawidgets-4.3.2-9.2.noarch.rpm"
RPM_HASH = "4c1e6c6f80043b508da4d4acbeb62d63fa4609dbece83ff6032765deffdc257ba2f6e888b5c8da59355616ab04891e34cea3fde875984bdd1be610b6a19164dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipydatawidgets \
python3-jupyter_ipydatawidgets \
python3.10dist(ipydatawidgets) \
python310-ipydatawidgets \
python310-jupyter_ipydatawidgets \
python3dist(ipydatawidgets)"
RDEPENDS:${PN} += "jupyter-ipydatawidgets \
python(abi) \
python310-ipywidgets \
python310-numpy \
python310-traittypes"

inherit rpm
