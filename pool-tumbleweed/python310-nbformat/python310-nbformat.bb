SUMMARY = "The Jupyter Notebook format"
DESCRIPTION = "This package contains the base implementation of the Jupyter Notebook format, \
and Python APIs for working with notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "5.9.0"

RPM_NAME = "python310-nbformat-5.9.0-1.3.noarch.rpm"
RPM_HASH = "043637de9a859230df8196560b29fa0c05ebcec8b7f9710d475a4a48e9a2e0d6357f1c80f47bcc3e96811d1d1563d9e1c4dcf30a99b67172d745275337724139"
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
