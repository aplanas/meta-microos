SUMMARY = "Pygments theme for jupyterlab"
DESCRIPTION = "This package contains a syntax coloring theme for pygments making use \
of the JupyterLab CSS variables."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python311-jupyterlab-pygments-0.2.2-3.3.noarch.rpm"
RPM_HASH = "8c0f8dfba054d4389a18f4d7c366cdec98a79880d65baa363d5e1d6643f3b14211d17da9e6231aa7b6aa3c14c7e73bfdb3c1b70d9bbd8fb362f6729a0be42586"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-jupyterlab-pygments \
python311-jupyterlab-pygments \
python3dist-jupyterlab-pygments"

RDEPENDS:${PN} += "jupyter-jupyterlab-pygments \
python-abi \
python311-pygments"

inherit rpm
