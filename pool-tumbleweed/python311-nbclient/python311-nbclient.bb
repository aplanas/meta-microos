SUMMARY = "A client library for executing notebooks"
DESCRIPTION = "A client library for executing notebooks. Formally nbconvert's \
ExecutePreprocessor. \
 \
NBClient is a tool for parameterizing andexecuting Jupyter Notebooks."
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "python311-nbclient-0.8.0-1.4.noarch.rpm"
RPM_HASH = "a2364773b80e64390dad5074a7506e77e2ce7534a0e8e21a0442960beb9148f916e7df730f419c91f003c7e7f1fb8d3660d35661faf364aa50913bb422990cc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nbclient \
python3.11dist-nbclient \
python311-nbclient \
python3dist-nbclient"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-jupyter-client \
python311-nbformat \
python311-traitlets"

inherit rpm
