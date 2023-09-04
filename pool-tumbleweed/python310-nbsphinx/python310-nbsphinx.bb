SUMMARY = "Jupyter Notebook Tools for Sphinx"
DESCRIPTION = "The nbsphinx package is a Sphinx extension that provides a source \
parser for *.ipynb files. Custom Sphinx directives are used to show \
Jupyter Notebook code cells (and of course their results) in both HTML \
and LaTeX output. Un-evaluated notebooks – i.e. notebooks without \
stored output cells – will be automatically executed during the Sphinx \
build process."
LICENSE = "MIT"

PV = "0.9.3"

RPM_NAME = "python310-nbsphinx-0.9.3-1.1.noarch.rpm"
RPM_HASH = "697be6eb4d4064c56115a072820c2cac1bbbd7b0ad96b72655c641c0f366f69ed1f515fc9b506264b4b099fb7939eaef186c7cc4e0ba75455229d897cfbcdd59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nbsphinx \
python310-jupyter-nbsphinx \
python310-nbsphinx \
python3dist-nbsphinx"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-Sphinx \
python310-docutils \
python310-nbconvert \
python310-nbformat \
python310-traitlets"

inherit rpm
