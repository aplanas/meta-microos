SUMMARY = "Tools for diffing and merging Jupyter Notebooks"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python311-nbdime-3.2.1-15.1.noarch.rpm"
RPM_HASH = "8ba2601395189126886251749a95a96ef3b06f18a54905a1e91952fecc464051ac2df6f8e076c0e6f3e7f548d940806d16a070b253acbb16aea8301aa9e728b0"
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
