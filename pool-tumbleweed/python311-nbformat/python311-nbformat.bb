SUMMARY = "The Jupyter Notebook format"
DESCRIPTION = "This package contains the base implementation of the Jupyter Notebook format, \
and Python APIs for working with notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "5.9.0"

RPM_NAME = "python311-nbformat-5.9.0-1.3.noarch.rpm"
RPM_HASH = "5ab7533de38493b93174fdf175d7af99d34f196dcbfa6d75037308ef3d5856e7921fa32d86b381da2f6aaa6adf4ccf4573cb16e2dc7dff4ead03a718b1a89944"
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
