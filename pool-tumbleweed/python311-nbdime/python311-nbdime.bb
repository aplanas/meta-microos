SUMMARY = "Tools for diffing and merging Jupyter Notebooks"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python311-nbdime-3.2.1-13.1.noarch.rpm"
RPM_HASH = "07858b7add32a5f9c5e271d0cbb2118c89730c9139df3a0547a7a2559c261faecfc46bc04e79532cb989e4913d000882e0c3dc8c84215b9d0a28a7cdd29af06e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-nbdime \
python3-nbdime \
python3.11dist-nbdime \
python311-jupyter-nbdime \
python311-nbdime \
python3dist-nbdime"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
jupyter-nbdime \
python-abi \
python311-GitPython \
python311-Jinja2 \
python311-Pygments \
python311-colorama \
python311-jupyter-server \
python311-jupyter-server-mathjax \
python311-nbformat \
python311-requests \
python311-tornado"

inherit rpm
