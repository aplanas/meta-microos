SUMMARY = "LaTeX environments for Jupyter notebook"
DESCRIPTION = "Jupyter notebook extension which supports (some) LaTeX environments \
within markdown cells. Also provides support for labels and \
crossreferences, document wide numbering, bibliography, and more. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "1.4.6"

RPM_NAME = "python311-jupyter_latex_envs-1.4.6-5.7.noarch.rpm"
RPM_HASH = "0841a5e90c55e8e2b86ecb6206bf54a8c5cfdbe841d11ab60b2c71154b2c008062b2082032aa5ff02f02a9f320d7b159f59676a1154498994bc8e29c195a5d9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jupyter-latex-envs) \
python311-jupyter_latex_envs \
python3dist(jupyter-latex-envs)"

RDEPENDS:${PN} += "python(abi) \
python311-ipython \
python311-jupyter_core \
python311-nbconvert \
python311-notebook \
python311-traitlets"

inherit rpm
