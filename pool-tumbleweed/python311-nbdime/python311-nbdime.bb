SUMMARY = "Tools for diffing and merging Jupyter Notebooks"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python311-nbdime-3.2.1-12.3.noarch.rpm"
RPM_HASH = "4f5f634d59e66e4078c500db125e56bee24faaa4fb2a97913174c812617dcd0d3b5e3fbb48b2bfb7cfb87016bef624f35aa55de8763890f0c4d5b5dd7a609e7d"
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
