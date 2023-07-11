SUMMARY = "A client library for executing notebooks"
DESCRIPTION = "A client library for executing notebooks. Formally nbconvert's \
ExecutePreprocessor. \
 \
NBClient is a tool for parameterizing andexecuting Jupyter Notebooks."
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "python310-nbclient-0.8.0-1.4.noarch.rpm"
RPM_HASH = "eff49b18e75a3c1fe9a2b337d6ccd90953b892674bdf00c81142f4cf9a532d49ed3cd1d727833f638c2b58d10c0eb07c5f5ee4afdfa01f58c6f1e663a9bb0271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nbclient \
python310-nbclient \
python3dist-nbclient"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-jupyter-client \
python310-nbformat \
python310-traitlets"

inherit rpm
