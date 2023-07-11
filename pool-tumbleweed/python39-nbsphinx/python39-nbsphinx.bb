SUMMARY = "Jupyter Notebook Tools for Sphinx"
DESCRIPTION = "The nbsphinx package is a Sphinx extension that provides a source \
parser for *.ipynb files. Custom Sphinx directives are used to show \
Jupyter Notebook code cells (and of course their results) in both HTML \
and LaTeX output. Un-evaluated notebooks – i.e. notebooks without \
stored output cells – will be automatically executed during the Sphinx \
build process."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python39-nbsphinx-0.9.2-1.2.noarch.rpm"
RPM_HASH = "c01bfbcdff1ef936b6f04fb6466ba726731577d907359ae51a7a6753c6622755d087e209b18ef4860e6beeea82cdf50fce4d63dc6a4b21a11edf709602872cf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nbsphinx \
python39-jupyter-nbsphinx \
python39-nbsphinx \
python3dist-nbsphinx"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2 \
python39-Sphinx \
python39-docutils \
python39-nbconvert \
python39-nbformat \
python39-traitlets"

inherit rpm
