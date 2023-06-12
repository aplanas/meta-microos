SUMMARY = "Pygments theme for jupyterlab"
DESCRIPTION = "This package contains a syntax coloring theme for pygments making use \
of the JupyterLab CSS variables."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python310-jupyterlab-pygments-0.2.2-3.3.noarch.rpm"
RPM_HASH = "b444c8a731b1ac0d9629872ecb10a221ce94a764796e66ba07954318a1ccef850cc964f4418cf2220a41d085faa89d68a21ef06f069a744ebf7cc90808a90d65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyterlab-pygments \
python3.10dist(jupyterlab-pygments) \
python310-jupyterlab-pygments \
python3dist(jupyterlab-pygments)"
RDEPENDS:${PN} += "jupyter-jupyterlab-pygments \
python(abi) \
python310-pygments"

inherit rpm
