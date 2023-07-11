SUMMARY = "Jupyter Notebook Tools for Sphinx"
DESCRIPTION = "The nbsphinx package is a Sphinx extension that provides a source \
parser for *.ipynb files. Custom Sphinx directives are used to show \
Jupyter Notebook code cells (and of course their results) in both HTML \
and LaTeX output. Un-evaluated notebooks – i.e. notebooks without \
stored output cells – will be automatically executed during the Sphinx \
build process."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python310-nbsphinx-0.9.2-1.2.noarch.rpm"
RPM_HASH = "ce8ac142692438c2330dc88f6afff50b8b37d8568b31b1ade9790337cc9b4ab38b835a9fafa363a56da4f228dc74a605ad5e63a7019944d502ef7920c183287e"
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
