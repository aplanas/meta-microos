SUMMARY = "A client library for executing notebooks"
DESCRIPTION = "A client library for executing notebooks. Formally nbconvert's \
ExecutePreprocessor. \
 \
NBClient is a tool for parameterizing andexecuting Jupyter Notebooks."
LICENSE = "BSD-3-Clause"

PV = "0.7.4"

RPM_NAME = "python311-nbclient-0.7.4-1.1.noarch.rpm"
RPM_HASH = "1567c14b6f1ba95c6f56d69baa2338f03c89bc826074436e44e798bef4cccfaddc6aa8f7f30a04987f8886f57a98e4ef5a2f5d235d10a47c49bbe6b6f8ad0e01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-nbclient \
python311-nbclient \
python3dist-nbclient"

RDEPENDS:${PN} += "-(python311-jupyter-core >= 4.12 with python311-jupyter-core < 5) or python311-jupyter-core >= 5.1 \
/bin/sh \
/usr/bin/python3.11 \
alts \
python-abi \
python311-jupyter-client \
python311-nbformat \
python311-traitlets"

inherit rpm
