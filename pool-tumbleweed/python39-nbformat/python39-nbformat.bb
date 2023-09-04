SUMMARY = "The Jupyter Notebook format"
DESCRIPTION = "This package contains the base implementation of the Jupyter Notebook format, \
and Python APIs for working with notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "5.9.2"

RPM_NAME = "python39-nbformat-5.9.2-1.1.noarch.rpm"
RPM_HASH = "466a36a8c9e411778f1f882f7d8b9cc0e383f38f906b98ed260a4c1660fefade6d72902048b1ec9e508e00cec3fd76404d09f953e24b78138b5ed6033aed61ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nbformat \
python39-jupyter-nbformat \
python39-nbformat \
python3dist-nbformat"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39-fastjsonschema \
python39-jsonschema \
python39-jupyter-core \
python39-traitlets"

inherit rpm
