SUMMARY = "A client library for executing notebooks"
DESCRIPTION = "A client library for executing notebooks. Formally nbconvert's \
ExecutePreprocessor. \
 \
NBClient is a tool for parameterizing andexecuting Jupyter Notebooks."
LICENSE = "BSD-3-Clause"

PV = "0.7.4"

RPM_NAME = "python310-nbclient-0.7.4-1.1.noarch.rpm"
RPM_HASH = "651e0fc4b72740e1f316e12c3a2e5e16068dc3c13c39035ae6566f7752129ba0f8073bb4a56fe3ffc46a59b080cb83271b24a6650b1c6b52365364abbfc607b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nbclient \
python3.10dist-nbclient \
python310-nbclient \
python3dist-nbclient"

RDEPENDS:${PN} += "-(python310-jupyter-core >= 4.12 with python310-jupyter-core < 5) or python310-jupyter-core >= 5.1 \
/bin/sh \
/usr/bin/python3.10 \
alts \
python-abi \
python310-jupyter-client \
python310-nbformat \
python310-traitlets"

inherit rpm
