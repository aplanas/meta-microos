SUMMARY = "Jupyterlab extension for python-ipytablewidgets"
DESCRIPTION = "Traitlets and widgets to efficiently data tables (e.g. Pandas DataFrame) using the jupyter notebook \
 \
This package provides the jupyterlab extension"
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "jupyter-ipytablewidgets-jupyterlab-0.3.1-2.1.noarch.rpm"
RPM_HASH = "ceabe71209b0fb73f3ab7c375bd005c835e1dfec767d0cab786f79543cbbbdda07c9f18da219d568174cc3171892600c7b71f0d1ecb9bffe8e6f715ff5f3f0f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipytablewidgets-jupyterlab"

RDEPENDS:${PN} += "python3dist-ipytablewidgets"

inherit rpm
