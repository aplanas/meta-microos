SUMMARY = "LaTeX environments for Jupyter notebook"
DESCRIPTION = "Jupyter notebook extension which supports (some) LaTeX environments \
within markdown cells. Also provides support for labels and \
crossreferences, document wide numbering, bibliography, and more. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "1.4.6"

RPM_NAME = "python311-jupyter_latex_envs-1.4.6-5.8.noarch.rpm"
RPM_HASH = "edeaea3f34ecc30b82ff4974ee4f2ac0672a5e2518ba0f5283f6910729c030fa52ede9aadb8a715a85ffddff6653c8fa3b3025e9a932b1fd67255a83c97e453f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-latex-envs \
python3.11dist-jupyter-latex-envs \
python311-jupyter-latex-envs \
python3dist-jupyter-latex-envs"

RDEPENDS:${PN} += "python-abi \
python311-ipython \
python311-jupyter-core \
python311-nbconvert \
python311-notebook \
python311-traitlets"

inherit rpm
