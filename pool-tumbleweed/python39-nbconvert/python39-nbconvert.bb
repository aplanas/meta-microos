SUMMARY = "Conversion of Jupyter Notebooks"
DESCRIPTION = "The jupyter nbconvert package converts notebooks to various other formats \
via Jinja templates. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause & MIT"

PV = "7.6.0"

RPM_NAME = "python39-nbconvert-7.6.0-1.2.noarch.rpm"
RPM_HASH = "01e67d64bb3881d60cbc2125e980572c6ccf0369ed019254c3abd4a55ad077e5c15ce6abbd07cf52dfd9f35a3926b0a0e81bb304e2657894656b43d862257c79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nbconvert \
python39-jupyter-nbconvert \
python39-nbconvert \
python3dist-nbconvert"

RDEPENDS:${PN} += "-python39-bleach without python39-bleach = 5.0.0 \
-python39-mistune >= 2.0.3 with python39-mistune < 4 \
/usr/bin/python3.9 \
/usr/bin/sh \
alts \
jupyter-nbconvert \
python-abi \
python39-Jinja2 \
python39-MarkupSafe \
python39-Pygments \
python39-beautifulsoup4 \
python39-defusedxml \
python39-importlib-metadata \
python39-jupyter-core \
python39-jupyterlab-pygments \
python39-nbclient \
python39-nbformat \
python39-packaging \
python39-pandocfilters \
python39-tinycss2 \
python39-traitlets"

inherit rpm
