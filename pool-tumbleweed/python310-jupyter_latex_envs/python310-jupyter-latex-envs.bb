SUMMARY = "LaTeX environments for Jupyter notebook"
DESCRIPTION = "Jupyter notebook extension which supports (some) LaTeX environments \
within markdown cells. Also provides support for labels and \
crossreferences, document wide numbering, bibliography, and more. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "1.4.6"

RPM_NAME = "python310-jupyter_latex_envs-1.4.6-5.7.noarch.rpm"
RPM_HASH = "03e8ee8a837edb13ad565857574077f9918d1d01b166e835581b6bc73273d53788dd7571cdf511ac9b1c74c6d4e20dec54f074b38a25e7abc3d49f61050e6b91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter_latex_envs \
python3.10dist(jupyter-latex-envs) \
python310-jupyter_latex_envs \
python3dist(jupyter-latex-envs)"
RDEPENDS:${PN} += "python(abi) \
python310-ipython \
python310-jupyter_core \
python310-nbconvert \
python310-notebook \
python310-traitlets"

inherit rpm
