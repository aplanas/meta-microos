SUMMARY = "Tools for diffing and merging Jupyter Notebooks"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python310-nbdime-3.2.1-12.3.noarch.rpm"
RPM_HASH = "790f087d7828ee769db12e5ad43b6ce19c5635b394721c0953c7ddbbf825c3c5550526ef1e92c875026d8fec58e4d2990eb8133b2b6673b33ef4fd6ca18f60c5"
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
