SUMMARY = "LaTeX environments for Jupyter notebook"
DESCRIPTION = "Jupyter notebook extension which supports (some) LaTeX environments \
within markdown cells. Also provides support for labels and \
crossreferences, document wide numbering, bibliography, and more. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "1.4.6"

RPM_NAME = "python39-jupyter_latex_envs-1.4.6-5.8.noarch.rpm"
RPM_HASH = "6d284b51f92f47ab9f67fc09a1b6ac061005f530699ae26255d1e911ad52decf0b3c73d4cf2fd7a0a4ffd5e2cc2f34ab41ca2c31d7c0edd940d7c210a437ec62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyter-latex-envs \
python39-jupyter-latex-envs \
python3dist-jupyter-latex-envs"

RDEPENDS:${PN} += "python-abi \
python39-ipython \
python39-jupyter-core \
python39-nbconvert \
python39-notebook \
python39-traitlets"

inherit rpm
