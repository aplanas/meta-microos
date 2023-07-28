SUMMARY = "Tools for diffing and merging Jupyter Notebooks"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python310-nbdime-3.2.1-13.1.noarch.rpm"
RPM_HASH = "665f6458e6ba9b579c911131cff8ddfa6d10559a03fd16d508feff62442fd66ec2383e64fab54c3a4b4b4c314b80ccc60c3105e343642bb31217576176f9d817"
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
