SUMMARY = "A Jupyter widget library for scales"
DESCRIPTION = "A Jupyter/IPython widget library for scales. \
 \
This package provides the jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "jupyter-ipyscales-0.7.0-6.1.noarch.rpm"
RPM_HASH = "73398981a56a47534a3c4b5138c89f09654875afe01a41bd0ea764022f66ea21b308c448b190043d27c50f05e66624c38596f88d1a1e67d9693764530d57dbed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyscales"

RDEPENDS:${PN} += "python3dist-ipyscales"

inherit rpm
