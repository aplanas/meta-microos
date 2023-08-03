SUMMARY = "Tools for diffing and merging Jupyter Notebooks"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python39-nbdime-3.2.1-14.1.noarch.rpm"
RPM_HASH = "c000c7c4ebb39b57e19a4f0b950aff2cd6236af6c854890835f80228189467847bf2c23e3d34ce3710b29e4643fabd44328edf4db49526ce811dc2051751fef5"
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
