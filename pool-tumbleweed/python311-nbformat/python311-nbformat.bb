SUMMARY = "The Jupyter Notebook format"
DESCRIPTION = "This package contains the base implementation of the Jupyter Notebook format, \
and Python APIs for working with notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "5.9.0"

RPM_NAME = "python311-nbformat-5.9.0-2.1.noarch.rpm"
RPM_HASH = "87622ec79807bf1784d93c6c662460e3faa8e5097fa0bae56ed8a5e5632138fc84951ee851a43d9845b41bcb8313d1efad478ed032db8a6199a5c6eca7307576"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-nbformat \
python3-nbformat \
python3.11dist-nbformat \
python311-jupyter-nbformat \
python311-nbformat \
python3dist-nbformat"

RDEPENDS:${PN} += "-python311-jsonschema > 2.6 with python311-jsonschema < 4.18 \
/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-fastjsonschema \
python311-jupyter-core \
python311-traitlets"

inherit rpm
