SUMMARY = "Tools for diffing and merging Jupyter Notebooks"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python39-nbdime-3.2.1-13.1.noarch.rpm"
RPM_HASH = "a08b1c3f545ab9082fcf9e56f3b9095d8f612a892ff0c226d297fcf57f87915e97e75c57a9ec8537c1b6cd621d87f8ba0f0462682f056d532258faf9adf3f59c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nbdime \
python39-jupyter-nbdime \
python39-nbdime \
python3dist-nbdime"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
jupyter-nbdime \
python-abi \
python39-GitPython \
python39-Jinja2 \
python39-Pygments \
python39-colorama \
python39-jupyter-server \
python39-jupyter-server-mathjax \
python39-nbformat \
python39-requests \
python39-tornado"

inherit rpm
