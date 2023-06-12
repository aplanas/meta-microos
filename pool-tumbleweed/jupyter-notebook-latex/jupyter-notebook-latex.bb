SUMMARY = "LaTeX support for the Jupyter Notebook"
DESCRIPTION = "The Jupyter HTML notebook is a web-based notebook environment for \
interactive computing. \
 \
This package pulls in the LaTeX dependencies for the Jupyter Notebook."
LICENSE = "BSD-3-Clause"

PV = "6.5.4"

RPM_NAME = "jupyter-notebook-latex-6.5.4-1.1.noarch.rpm"
RPM_HASH = "4041f7adbe01866e110e19e8a98bd9545cfebdd1b504498b6fdc9b2630a48ef1a8c2cd5c696e28acb0350c8803345505a9a09e0b810376ea64b5738dea01d064"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-notebook-latex \
python310-jupyter_notebook-latex \
python310-notebook-latex \
python311-jupyter_notebook-latex \
python311-notebook-latex \
python39-jupyter_notebook-latex \
python39-notebook-latex"
RDEPENDS:${PN} += "jupyter-nbconvert-latex \
jupyter-notebook"

inherit rpm
