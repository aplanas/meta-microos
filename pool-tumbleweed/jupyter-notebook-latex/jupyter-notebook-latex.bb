SUMMARY = "LaTeX support for the Jupyter Notebook"
DESCRIPTION = "The Jupyter HTML notebook is a web-based notebook environment for \
interactive computing. \
 \
This package pulls in the LaTeX dependencies for the Jupyter Notebook."
LICENSE = "BSD-3-Clause"

PV = "6.5.4"

RPM_NAME = "jupyter-notebook-latex-6.5.4-1.2.noarch.rpm"
RPM_HASH = "5aa172db7920edd4eb937d8a51ca3ab2b434591ef196132da91e0c6157be454bada64782055dba4b9a7bee5f696bb3cc3ebb323d1f7a17eb5431c2bd24e778de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-notebook-latex \
python310-jupyter-notebook-latex \
python310-notebook-latex \
python311-jupyter-notebook-latex \
python311-notebook-latex \
python39-jupyter-notebook-latex \
python39-notebook-latex"

RDEPENDS:${PN} += "jupyter-nbconvert-latex \
jupyter-notebook"

inherit rpm
