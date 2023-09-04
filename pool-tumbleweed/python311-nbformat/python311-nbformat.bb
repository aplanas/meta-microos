SUMMARY = "The Jupyter Notebook format"
DESCRIPTION = "This package contains the base implementation of the Jupyter Notebook format, \
and Python APIs for working with notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "5.9.2"

RPM_NAME = "python311-nbformat-5.9.2-1.1.noarch.rpm"
RPM_HASH = "c30f1cbbda003f7413c4e8535f10e91824f623fcbae7c5723fa29e69d3f16a65caabd73d3733b403f47e84ac6104da5a8b8b9a7001e27cff06413cdfd5194db8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-nbformat \
python3-nbformat \
python3.11dist-nbformat \
python311-jupyter-nbformat \
python311-nbformat \
python3dist-nbformat"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-fastjsonschema \
python311-jsonschema \
python311-jupyter-core \
python311-traitlets"

inherit rpm
