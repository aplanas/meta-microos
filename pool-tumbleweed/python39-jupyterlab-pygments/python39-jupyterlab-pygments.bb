SUMMARY = "Pygments theme for jupyterlab"
DESCRIPTION = "This package contains a syntax coloring theme for pygments making use \
of the JupyterLab CSS variables."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python39-jupyterlab-pygments-0.2.2-3.5.noarch.rpm"
RPM_HASH = "e3518dfb29ee89dbcb800f1ca9891c04758cbe886bd25f702ac1fec241241f1be05d768b0b528ecdb8201c48ad2facbcd6ccedddcd01ea1ced9deec738aadcef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyterlab-pygments \
python39-jupyterlab-pygments \
python3dist-jupyterlab-pygments"

RDEPENDS:${PN} += "jupyter-jupyterlab-pygments \
python-abi \
python39-pygments"

inherit rpm
