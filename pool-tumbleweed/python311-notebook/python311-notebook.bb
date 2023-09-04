SUMMARY = "Jupyter Notebook interface"
DESCRIPTION = "The Jupyter HTML notebook is a web-based notebook environment for \
interactive computing. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "7.0.2"

RPM_NAME = "python311-notebook-7.0.2-1.1.noarch.rpm"
RPM_HASH = "a9ac93d0d69702a4f74355bd17e8bce9e790131cf9230024e024fd1424893effb30624249c297afa0ae4e7e01329295f71fffa957812766ea64bf97ba7d95ba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-notebook \
python3-notebook \
python3.11dist-notebook \
python311-jupyter-notebook \
python311-notebook \
python3dist-notebook"

RDEPENDS:${PN} += "-python311-jupyter-server >= 2.4 with python311-jupyter-server < 3 \
-python311-jupyterlab >= 4.0.2 with python311-jupyterlab < 5 \
-python311-jupyterlab-server >= 2.22.1 with python311-jupyterlab-server < 3 \
-python311-notebook-shim >= 0.2 with python311-notebook-shim < 0.3 \
/usr/bin/python3.11 \
/usr/bin/sh \
alts \
jupyter-notebook \
python-abi \
python311-tornado"

inherit rpm
