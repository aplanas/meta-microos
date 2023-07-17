SUMMARY = "The Jupyter Notebook format"
DESCRIPTION = "This package contains the base implementation of the Jupyter Notebook format, \
and Python APIs for working with notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "5.9.0"

RPM_NAME = "python310-nbformat-5.9.0-2.1.noarch.rpm"
RPM_HASH = "366c765685748dbb3a00d74b4045c84ffa33b80bc079c44e75267f3e31ac6874c569591ccb8f747035c0af790e577674bf243cc701b36ccd0fc774727f7d60f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nbformat \
python310-jupyter-nbformat \
python310-nbformat \
python3dist-nbformat"

RDEPENDS:${PN} += "-python310-jsonschema > 2.6 with python310-jsonschema < 4.18 \
/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-fastjsonschema \
python310-jupyter-core \
python310-traitlets"

inherit rpm
