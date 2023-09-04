SUMMARY = "Tools for diffing and merging Jupyter Notebooks"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python39-nbdime-3.2.1-15.1.noarch.rpm"
RPM_HASH = "19e77b840edb8642bb9209d9b7391e5742eb28411b12d9c4bb71ac0eb753e59c24f458f01795d937308af8cc13581a77163f198285d4882e3395d267484113c2"
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
