SUMMARY = "LaTeX environments for Jupyter notebook"
DESCRIPTION = "Jupyter notebook extension which supports (some) LaTeX environments \
within markdown cells. Also provides support for labels and \
crossreferences, document wide numbering, bibliography, and more. \
 \
This package provides the jupyter components."
LICENSE = "BSD-3-Clause"

PV = "1.4.6"

RPM_NAME = "jupyter-jupyter_latex_envs-1.4.6-5.8.noarch.rpm"
RPM_HASH = "3e80d7fb3178ef9de5bb28b4900d9a4ba44cca6cdd9f525aacfead921761ed889801c1603b932e73d765429d8d16bcacb7cde263449b62a85b4e2fd6074c1cbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-latex-envs"

RDEPENDS:${PN} += "jupyter-jupyter-core \
jupyter-nbconvert \
jupyter-notebook \
python3-jupyter-latex-envs"

inherit rpm
