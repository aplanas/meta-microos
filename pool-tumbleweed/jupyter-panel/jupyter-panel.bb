SUMMARY = "Jupyter notebook and server cofiguration for python-panel"
DESCRIPTION = "Panel is a Python library that lets you create custom interactive web apps and \
dashboards by connecting user-defined widgets to plots, images, tables, or \
text. \
 \
This package contains the notebook and server extension configuration common \
to all Python flavors."
LICENSE = "BSD-3-Clause"

PV = "0.14.4"

RPM_NAME = "jupyter-panel-0.14.4-1.2.noarch.rpm"
RPM_HASH = "878584d8e3ca061348083aced87df6d5531d8a3941f103cfe1ffb4932d62e071428054b32d13e143f1186de109f1953a020c371cbb89be61a13256098c9f3d17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-panel"
RDEPENDS:${PN} += ""

inherit rpm
