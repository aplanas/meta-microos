SUMMARY = "Tools for diffing and merging Jupyter Notebooks"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python311-nbdime-3.2.1-14.1.noarch.rpm"
RPM_HASH = "c8be079e97b317204883a4f9c77af903b678000d05364b78bb2be595a4156019893b63fcdbe75889f4ae4930078faa857ed1503810ba273afb149331800f5be7"
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
