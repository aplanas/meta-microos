SUMMARY = "Macros for building Jupyter RPM packages"
DESCRIPTION = "This package provides macros for building packages that interface with \
Jupyter, Notebook or Jupyterlab."
LICENSE = "BSD-3-Clause"

PV = "20221227"

RPM_NAME = "jupyter-rpm-macros-20221227-12.1.noarch.rpm"
RPM_HASH = "1aa76b9b187740bc85c54745df09aa3a6b28f1b045549289f705be0272afb8507bdd69efc44017b8e7bb93a405f5ec6ca1615d86621d50d004edc6bc81b2bc17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-rpm-macros"

RDEPENDS:${PN} += "jupyter-jupyter_core-filesystem \
jupyter-jupyterlab-filesystem \
jupyter-notebook-filesystem"

inherit rpm
