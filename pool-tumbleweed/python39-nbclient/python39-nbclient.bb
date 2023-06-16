SUMMARY = "A client library for executing notebooks"
DESCRIPTION = "A client library for executing notebooks. Formally nbconvert's \
ExecutePreprocessor. \
 \
NBClient is a tool for parameterizing andexecuting Jupyter Notebooks."
LICENSE = "BSD-3-Clause"

PV = "0.7.4"

RPM_NAME = "python39-nbclient-0.7.4-1.1.noarch.rpm"
RPM_HASH = "6dc2740bbe017e8ef81a0bfb2d76220ee421d0efd027b43e32056845c932cc549cb2896674397ca0c949d799427d097bec26d612d213067dc400e3c3a78e6120"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nbclient \
python39-nbclient \
python3dist-nbclient"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39-jupyter-client \
python39-nbformat \
python39-traitlets"

inherit rpm
