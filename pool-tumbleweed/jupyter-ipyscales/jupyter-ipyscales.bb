SUMMARY = "A Jupyter widget library for scales"
DESCRIPTION = "A Jupyter/IPython widget library for scales. \
 \
This package provides the jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "jupyter-ipyscales-0.7.0-5.5.noarch.rpm"
RPM_HASH = "95cb4efdabaa2ea7821f58792fb42c3a7200a0ea225c9cc412a88ad60316d93f3f67318fc254360d968b90c1189d2798fc3db294068b406a063d69762753b2a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyscales"

RDEPENDS:${PN} += "jupyter-notebook"

inherit rpm
