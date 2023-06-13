SUMMARY = "HTML documentation for jupyter"
DESCRIPTION = "Documentation and help files for jupyter."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "jupyter-doc-1.0.0-12.1.noarch.rpm"
RPM_HASH = "48d2369219e61588132e514b4ad3fb63d8bdc5a9ff72e02b53aac550cdf6468393292756eb454d96091f916d74a4bc746d7345f2f54aa2c055470c89c9181978"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-doc \
jupyter-doc-html \
jupyter-doc-pdf \
python310-jupyter-doc \
python310-jupyter-doc-html \
python310-jupyter-doc-pdf \
python311-jupyter-doc \
python311-jupyter-doc-html \
python311-jupyter-doc-pdf \
python39-jupyter-doc \
python39-jupyter-doc-html \
python39-jupyter-doc-pdf"

RDEPENDS:${PN} += ""

inherit rpm
