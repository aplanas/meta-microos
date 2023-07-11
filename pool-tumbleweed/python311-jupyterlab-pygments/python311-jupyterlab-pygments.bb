SUMMARY = "Pygments theme for jupyterlab"
DESCRIPTION = "This package contains a syntax coloring theme for pygments making use \
of the JupyterLab CSS variables."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python311-jupyterlab-pygments-0.2.2-3.5.noarch.rpm"
RPM_HASH = "9dc3d708a906655d0f3cc6103ca5d73b9ef1c362090cee13ac52fa08f99c7f4116e1c5f1ba40fb96648984217723ae49d155c1daeb251fa33d1677c9a23ba2c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyterlab-pygments \
python3.11dist-jupyterlab-pygments \
python311-jupyterlab-pygments \
python3dist-jupyterlab-pygments"

RDEPENDS:${PN} += "jupyter-jupyterlab-pygments \
python-abi \
python311-pygments"

inherit rpm
