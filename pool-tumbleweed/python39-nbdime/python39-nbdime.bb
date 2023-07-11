SUMMARY = "Tools for diffing and merging Jupyter Notebooks"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python39-nbdime-3.2.1-12.3.noarch.rpm"
RPM_HASH = "b306ebe6b58a4f6f16438ca770bbd6d1aefa78ac8299c22c193ff26c2335aaa0acf0bcf96cf02e97e5ca6989b5970a4375660a1aa4aaa954091b96cda44fe8e2"
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
