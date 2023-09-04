SUMMARY = "Jupyter Notebook interface"
DESCRIPTION = "The Jupyter HTML notebook is a web-based notebook environment for \
interactive computing. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "7.0.2"

RPM_NAME = "python39-notebook-7.0.2-1.1.noarch.rpm"
RPM_HASH = "0cd8366514582aa7c27fb5fea1b1027178d65917a7839e1c6e4f0cf547c211944f589e1fffb1d562c1ac553523248ae88d5e899548ba34e6f97ce1c355fd0029"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-notebook \
python39-jupyter-notebook \
python39-notebook \
python3dist-notebook"

RDEPENDS:${PN} += "-python39-jupyter-server >= 2.4 with python39-jupyter-server < 3 \
-python39-jupyterlab >= 4.0.2 with python39-jupyterlab < 5 \
-python39-jupyterlab-server >= 2.22.1 with python39-jupyterlab-server < 3 \
-python39-notebook-shim >= 0.2 with python39-notebook-shim < 0.3 \
/usr/bin/python3.9 \
/usr/bin/sh \
alts \
jupyter-notebook \
python-abi \
python39-tornado"

inherit rpm
