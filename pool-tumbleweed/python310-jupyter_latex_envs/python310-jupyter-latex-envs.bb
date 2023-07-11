SUMMARY = "LaTeX environments for Jupyter notebook"
DESCRIPTION = "Jupyter notebook extension which supports (some) LaTeX environments \
within markdown cells. Also provides support for labels and \
crossreferences, document wide numbering, bibliography, and more. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "1.4.6"

RPM_NAME = "python310-jupyter_latex_envs-1.4.6-5.8.noarch.rpm"
RPM_HASH = "5c213a172317dfbbf3ed50b44f4a422f34ee5758bf7ad4f9b36b8c80f6079bb3de6f1d338fae4c0e93264b8fb2adefb0191685d5070ef2c7ed2a48779de5f892"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyter-latex-envs \
python310-jupyter-latex-envs \
python3dist-jupyter-latex-envs"

RDEPENDS:${PN} += "python-abi \
python310-ipython \
python310-jupyter-core \
python310-nbconvert \
python310-notebook \
python310-traitlets"

inherit rpm
