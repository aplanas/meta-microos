SUMMARY = "Conversion of Jupyter Notebooks"
DESCRIPTION = "The jupyter nbconvert package converts notebooks to various other formats \
via Jinja templates. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause & MIT"

PV = "7.7.3"

RPM_NAME = "python39-nbconvert-7.7.3-2.1.noarch.rpm"
RPM_HASH = "3081b6f6e2cdff00b9c5cb21b5789512a273c55adfb32d7402f4455820a672f868ae056b24b190c579fecf935f8ad5f4043ec1c70dbfb3a6ea762f0ce3cc9431"
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
