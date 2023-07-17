SUMMARY = "The Jupyter Notebook format"
DESCRIPTION = "This package contains the base implementation of the Jupyter Notebook format, \
and Python APIs for working with notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "5.9.0"

RPM_NAME = "python39-nbformat-5.9.0-2.1.noarch.rpm"
RPM_HASH = "335f9ddff8e4618840dc205758a09693814b6b2ce6d45715b75e03439430e95b5f044ea33fe6780e156d1f87cde464ed711814a36e87e18b117f6e64ef3aed37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nbformat \
python39-jupyter-nbformat \
python39-nbformat \
python3dist-nbformat"

RDEPENDS:${PN} += "-python39-jsonschema > 2.6 with python39-jsonschema < 4.18 \
/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39-fastjsonschema \
python39-jupyter-core \
python39-traitlets"

inherit rpm
