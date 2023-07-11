SUMMARY = "A client library for executing notebooks"
DESCRIPTION = "A client library for executing notebooks. Formally nbconvert's \
ExecutePreprocessor. \
 \
NBClient is a tool for parameterizing andexecuting Jupyter Notebooks."
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "python39-nbclient-0.8.0-1.4.noarch.rpm"
RPM_HASH = "1d0d4519fb7dfe6ba989c09c250ac597e7342cfad17a19f64ecfd7ca56b157009e7c87154145b56c31397b150ecab86d746ea204713fd7f8042c4be3666f9470"
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
