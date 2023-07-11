SUMMARY = "Jupyter notebook and server cofiguration for python-panel"
DESCRIPTION = "Panel is a Python library that lets you create custom interactive web apps and \
dashboards by connecting user-defined widgets to plots, images, tables, or \
text. \
 \
This package contains the notebook and server extension configuration common \
to all Python flavors."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "jupyter-panel-1.1.1-1.1.noarch.rpm"
RPM_HASH = "ecdc72ba7cefe79d3c3d64c974da2504b9e11e403dce88d201e27ecfb5a23c77be935bb3806d11e3bb4abafb8e90566f5157b2b5cca3fb571780a4754bbaf606"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-panel"

RDEPENDS:${PN} += ""

inherit rpm
