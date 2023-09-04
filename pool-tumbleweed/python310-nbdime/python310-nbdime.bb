SUMMARY = "Tools for diffing and merging Jupyter Notebooks"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python310-nbdime-3.2.1-15.1.noarch.rpm"
RPM_HASH = "b83d8b029e12c6ca27b18084a3603e0e5cb5d847a54108d88eb9f668c0cdee698f4eab1eb74f03d7ac6ab765274eff27e8ed9c589892460cbaf2fb4af230d69b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nbdime \
python310-jupyter-nbdime \
python310-nbdime \
python3dist-nbdime"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
jupyter-nbdime \
python-abi \
python310-GitPython \
python310-Jinja2 \
python310-Pygments \
python310-colorama \
python310-jupyter-server \
python310-jupyter-server-mathjax \
python310-nbformat \
python310-requests \
python310-tornado"

inherit rpm
