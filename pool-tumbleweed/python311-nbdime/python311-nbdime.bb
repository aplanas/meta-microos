SUMMARY = "Tools for diffing and merging Jupyter Notebooks"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python311-nbdime-3.2.1-12.2.noarch.rpm"
RPM_HASH = "e822ef5c868b938a8c2ae463226741c25f36ca00b9f73c385331ff4007868f392007f4bcd1f0818dc15c48727abcfa802a7c21cd9fe78d164a538a881e99b874"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-nbdime \
python311-jupyter-nbdime \
python311-nbdime \
python3dist-nbdime"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
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
