SUMMARY = "Templates for notebooks in JupyterLab"
DESCRIPTION = "Support for jupyter notebook templates in jupyterlab."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "jupyter-jupyterlab-templates-0.5.0-2.1.noarch.rpm"
RPM_HASH = "30d72aa68940c23daefd3e7ba7ae74765f4bdf2c2cfee4a1b689be19838983ffe0e480a679dbc2545de5bd7ef98baa3e1e70642f8ad6a1872b2d848666b998b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-templates"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-jupyterlab-templates"

inherit rpm
