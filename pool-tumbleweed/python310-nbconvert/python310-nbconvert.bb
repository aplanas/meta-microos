SUMMARY = "Conversion of Jupyter Notebooks"
DESCRIPTION = "The jupyter nbconvert package converts notebooks to various other formats \
via Jinja templates. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause & MIT"

PV = "7.7.3"

RPM_NAME = "python310-nbconvert-7.7.3-2.1.noarch.rpm"
RPM_HASH = "a5c97b3dce16dc489640c84a0c6dc7e35aaee4096f0c2951e38dabc61efd5d07143999c0f8d8f1302bc7fabe144d4d50e03dc6e511663af38035e749feb7511a"
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
