SUMMARY = "Conversion of Jupyter Notebooks"
DESCRIPTION = "The jupyter nbconvert package converts notebooks to various other formats \
via Jinja templates. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause & MIT"

PV = "7.6.0"

RPM_NAME = "python310-nbconvert-7.6.0-1.2.noarch.rpm"
RPM_HASH = "28ebcc289d6db39379edcf02f598ce289ecf88044dd4d0e1e1dd8ca84b2ef7728ae94904a59fd2a913cc4f64367e2df9747232f75ff1e61acb0142f7b1724530"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nbconvert \
python310-jupyter-nbconvert \
python310-nbconvert \
python3dist-nbconvert"

RDEPENDS:${PN} += "-python310-bleach without python310-bleach = 5.0.0 \
-python310-mistune >= 2.0.3 with python310-mistune < 4 \
/usr/bin/python3.10 \
/usr/bin/sh \
alts \
jupyter-nbconvert \
python-abi \
python310-Jinja2 \
python310-MarkupSafe \
python310-Pygments \
python310-beautifulsoup4 \
python310-defusedxml \
python310-jupyter-core \
python310-jupyterlab-pygments \
python310-nbclient \
python310-nbformat \
python310-packaging \
python310-pandocfilters \
python310-tinycss2 \
python310-traitlets"

inherit rpm
