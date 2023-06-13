SUMMARY = "LaTeX environments for Jupyter notebook"
DESCRIPTION = "Jupyter notebook extension which supports (some) LaTeX environments \
within markdown cells. Also provides support for labels and \
crossreferences, document wide numbering, bibliography, and more. \
 \
This package provides the jupyter components."
LICENSE = "BSD-3-Clause"

PV = "1.4.6"

RPM_NAME = "jupyter-jupyter_latex_envs-1.4.6-5.7.noarch.rpm"
RPM_HASH = "241881cad9f90c83ce4fa73302febdc21fab073891efbf9023fb75910c7cee26603bc3e5b7b5349129ac6e88c8cf358647b00ded5c4a21bbad47450de0c927e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter_latex_envs"

RDEPENDS:${PN} += "jupyter-jupyter_core \
jupyter-nbconvert \
jupyter-notebook \
python3-jupyter_latex_envs"

inherit rpm
