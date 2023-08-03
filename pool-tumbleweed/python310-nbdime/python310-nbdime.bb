SUMMARY = "Tools for diffing and merging Jupyter Notebooks"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python310-nbdime-3.2.1-14.1.noarch.rpm"
RPM_HASH = "b06ac54a4dbb48a216830edca6b58ac61dba0279964a982ca18fe923318ab883b43e0c9eb02b99daa4c9dc44896ba04e5a34f7d7bf14c9c9df79a4f4d50e24e5"
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
