SUMMARY = "Templates for notebooks in JupyterLab"
DESCRIPTION = "Support for jupyter notebook templates in jupyterlab."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "jupyter-jupyterlab-templates-0.4.0-2.1.noarch.rpm"
RPM_HASH = "6fe6904e7ccf281a8e779bdd4fe707e79fcbf05239d09db58140b6ed08e6b6211243a3f96d3750b3baac4935ac0291ae5c1ad4a08ea937644314c420fc56b408"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-templates"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-jupyterlab-templates"

inherit rpm
