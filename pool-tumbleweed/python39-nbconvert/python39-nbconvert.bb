SUMMARY = "Conversion of Jupyter Notebooks"
DESCRIPTION = "The jupyter nbconvert package converts notebooks to various other formats \
via Jinja templates. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause & MIT"

PV = "7.3.1"

RPM_NAME = "python39-nbconvert-7.3.1-2.1.noarch.rpm"
RPM_HASH = "1fb9a7feaf6ec2769525ad85beef136eaeecd366b92bc2302136dd64571eff6342abe6365b22bfa5cf4f1a0ed0dbfcd165767dde2302f76f4d146d786d9cc7cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(nbconvert) \
python39-jupyter_nbconvert \
python39-nbconvert \
python3dist(nbconvert)"
RDEPENDS:${PN} += "(python39-mistune >= 2.0.3 with python39-mistune < 3) \
/bin/sh \
/usr/bin/python3.9 \
alts \
jupyter-nbconvert \
python(abi) \
python39-Jinja2 \
python39-MarkupSafe \
python39-Pygments \
python39-beautifulsoup4 \
python39-bleach \
python39-defusedxml \
python39-importlib-metadata \
python39-jupyter-core \
python39-jupyterlab-pygments \
python39-lxml \
python39-nbclient \
python39-nbformat \
python39-packaging \
python39-pandocfilters \
python39-tinycss2 \
python39-traitlets"

inherit rpm
