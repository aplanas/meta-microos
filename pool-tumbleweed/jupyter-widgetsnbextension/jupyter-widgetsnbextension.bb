SUMMARY = "Jupyter interactive widgets for Jupyter Notebook - Jupyter Files"
DESCRIPTION = "This package makes Jupyter widgets available in the classic Jupyter Notebook. \
It provides the Jupyter configuration files."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.0.8"

RPM_NAME = "jupyter-widgetsnbextension-4.0.8-2.1.noarch.rpm"
RPM_HASH = "ad0f2158d36c975fe4cc2058899053a45500af09d260551bee1f769cadf0831545ac7c0131d5ee33dfab6207f6fb8ce767c632ab3b3c1711c854bfdcfa53d518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-js-widgets \
jupyter-jupyter-jupyter-widgets-notebook-manager \
jupyter-widgetsnbextension"

RDEPENDS:${PN} += "python3dist-widgetsnbextension"

inherit rpm
