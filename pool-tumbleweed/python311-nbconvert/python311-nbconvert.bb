SUMMARY = "Conversion of Jupyter Notebooks"
DESCRIPTION = "The jupyter nbconvert package converts notebooks to various other formats \
via Jinja templates. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause & MIT"

PV = "7.7.3"

RPM_NAME = "python311-nbconvert-7.7.3-2.1.noarch.rpm"
RPM_HASH = "c1a149caddaba0d07d61cbacbe3a88e043e506b1fb7dbd393e79653d0983a20a52fb92cb4a9f5dff10413815b5472a71121ebf724fe45f4a392b5dd02a210da0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-nbconvert \
python3-nbconvert \
python3.11dist-nbconvert \
python311-jupyter-nbconvert \
python311-nbconvert \
python3dist-nbconvert"

RDEPENDS:${PN} += "-python311-bleach without python311-bleach = 5.0.0 \
-python311-mistune >= 2.0.3 with python311-mistune < 4 \
/usr/bin/python3.11 \
/usr/bin/sh \
alts \
jupyter-nbconvert \
python-abi \
python311-Jinja2 \
python311-MarkupSafe \
python311-Pygments \
python311-beautifulsoup4 \
python311-defusedxml \
python311-jupyter-core \
python311-jupyterlab-pygments \
python311-nbclient \
python311-nbformat \
python311-packaging \
python311-pandocfilters \
python311-tinycss2 \
python311-traitlets"

inherit rpm
