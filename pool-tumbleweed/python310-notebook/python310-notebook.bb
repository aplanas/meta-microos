SUMMARY = "Jupyter Notebook interface"
DESCRIPTION = "The Jupyter HTML notebook is a web-based notebook environment for \
interactive computing. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "7.0.2"

RPM_NAME = "python310-notebook-7.0.2-1.1.noarch.rpm"
RPM_HASH = "5beb3c8e684f2444d0eebf23b796f0a342737e285ade92fec9c2c1dd17a8066da366931308c92b682aa105c519e060bc0916ded2626ec41c8b20e910db96ae3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-notebook \
python310-jupyter-notebook \
python310-notebook \
python3dist-notebook"

RDEPENDS:${PN} += "-python310-jupyter-server >= 2.4 with python310-jupyter-server < 3 \
-python310-jupyterlab >= 4.0.2 with python310-jupyterlab < 5 \
-python310-jupyterlab-server >= 2.22.1 with python310-jupyterlab-server < 3 \
-python310-notebook-shim >= 0.2 with python310-notebook-shim < 0.3 \
/usr/bin/python3.10 \
/usr/bin/sh \
alts \
jupyter-notebook \
python-abi \
python310-tornado"

inherit rpm
