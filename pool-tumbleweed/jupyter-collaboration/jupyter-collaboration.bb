SUMMARY = "A Jupyter Server Extension Providing Y Documents. -- Jupyter configuration"
DESCRIPTION = "A Jupyter Server Extension Providing Y Documents. \
 \
This subpackage provides the jupyter configuration"
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "jupyter-collaboration-1.0.0-1.2.noarch.rpm"
RPM_HASH = "98511e75153b717a0189f05ebdf539ba0eb559d7b0c45d745cde4a3c727a2aa8249e4835a6e04f7ec13c590b466a647a48aaa7c63768bcf96534c13dbe2dfe60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-collaboration"

RDEPENDS:${PN} += "python3dist-jupyter-collaboration"

inherit rpm
