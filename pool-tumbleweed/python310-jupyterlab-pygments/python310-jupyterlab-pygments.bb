SUMMARY = "Pygments theme for jupyterlab"
DESCRIPTION = "This package contains a syntax coloring theme for pygments making use \
of the JupyterLab CSS variables."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python310-jupyterlab-pygments-0.2.2-3.5.noarch.rpm"
RPM_HASH = "998171eed97b669bf46800ef6c707a243016d785f4307c7a663dea0a9f847e50570b73e9be9d8732f6b5833f6f84ec6747e0e8d25b1fd374be47ee90a1e0ac85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyterlab-pygments \
python310-jupyterlab-pygments \
python3dist-jupyterlab-pygments"

RDEPENDS:${PN} += "jupyter-jupyterlab-pygments \
python-abi \
python310-pygments"

inherit rpm
