SUMMARY = "The Jupyter Notebook format"
DESCRIPTION = "This package contains the base implementation of the Jupyter Notebook format, \
and Python APIs for working with notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "5.9.1"

RPM_NAME = "python310-nbformat-5.9.1-1.1.noarch.rpm"
RPM_HASH = "5b99bed1c1faa9318be41273c36be1b2278a6db534081f908423ce70dbf10ae1256ca6e876dd17c9095d511179ac07a209392f0def36b2642958906f3b152527"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nbformat \
python310-jupyter-nbformat \
python310-nbformat \
python3dist-nbformat"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-fastjsonschema \
python310-jsonschema \
python310-jupyter-core \
python310-traitlets"

inherit rpm
