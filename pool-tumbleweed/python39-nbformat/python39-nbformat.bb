SUMMARY = "The Jupyter Notebook format"
DESCRIPTION = "This package contains the base implementation of the Jupyter Notebook format, \
and Python APIs for working with notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "5.9.1"

RPM_NAME = "python39-nbformat-5.9.1-1.1.noarch.rpm"
RPM_HASH = "ee9cc84428d104bd29db001da5db7c6c18ed14bc9e565407a3a15782abcce6f0a2bd60c0ba9e9740b4beebe39a87846e1a2725b9b34e00c836210c1dcba99d58"
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
