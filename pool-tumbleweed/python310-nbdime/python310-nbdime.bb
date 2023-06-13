SUMMARY = "Tools for diffing and merging Jupyter Notebooks"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python310-nbdime-3.2.1-12.2.noarch.rpm"
RPM_HASH = "614bb89bab4759f2335925f1a19f0dc9b53a3228af957866d66a5579af996ac2daa65ce94e3ff67f464596c7dd75463428d56be17ccb0d85e1c8eaa1299c2356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter_nbdime \
python3-nbdime \
python3.10dist(nbdime) \
python310-jupyter_nbdime \
python310-nbdime \
python3dist(nbdime)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
alts \
jupyter-nbdime \
python(abi) \
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
