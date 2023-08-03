SUMMARY = "The Jupyter Notebook format"
DESCRIPTION = "This package contains the base implementation of the Jupyter Notebook format, \
and Python APIs for working with notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "5.9.1"

RPM_NAME = "python311-nbformat-5.9.1-1.1.noarch.rpm"
RPM_HASH = "6eb57f7107519b7a620ae53456847edb7dcc4bf625223e1944416ab1676146614b173922b236799529b245e4b370fa5b17e33d033984de6df4892e9a1be3d25c"
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
