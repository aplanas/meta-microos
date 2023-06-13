SUMMARY = "Pygments theme for jupyterlab"
DESCRIPTION = "This package contains a syntax coloring theme for pygments making use \
of the JupyterLab CSS variables."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python39-jupyterlab-pygments-0.2.2-3.3.noarch.rpm"
RPM_HASH = "5d7856f72c50426ce2cd3e237e885366dd46e4076c9f9f7f25d653249900660a0ff19aa4792c346a384d74cd4f7f649a0bcf5df39577d4fa16743613ec7c09df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jupyterlab-pygments) \
python39-jupyterlab-pygments \
python3dist(jupyterlab-pygments)"

RDEPENDS:${PN} += "jupyter-jupyterlab-pygments \
python(abi) \
python39-pygments"

inherit rpm
