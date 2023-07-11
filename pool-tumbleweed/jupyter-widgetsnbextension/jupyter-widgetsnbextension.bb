SUMMARY = "Jupyter interactive widgets for Jupyter Notebook - Jupyter Files"
DESCRIPTION = "This package makes Jupyter widgets available in the classic Jupyter Notebook. \
It provides the Jupyter configuration files."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.0.7"

RPM_NAME = "jupyter-widgetsnbextension-4.0.7-1.2.noarch.rpm"
RPM_HASH = "8960128d83ccec271de18d61e9eb533b51ccb22a96d163783f3f020f9fb1a34d1ad1628afcf849f44675fdffaf5af32c48d3ecec8337b585dd478b12cebdcb6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-js-widgets \
jupyter-jupyter-jupyter-widgets-notebook-manager \
jupyter-widgetsnbextension"

RDEPENDS:${PN} += "python3-widgetsnbextension"

inherit rpm
