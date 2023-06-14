SUMMARY = "Jupyter Notebook Tools for Sphinx"
DESCRIPTION = "The nbsphinx package is a Sphinx extension that provides a source \
parser for *.ipynb files. Custom Sphinx directives are used to show \
Jupyter Notebook code cells (and of course their results) in both HTML \
and LaTeX output. Un-evaluated notebooks – i.e. notebooks without \
stored output cells – will be automatically executed during the Sphinx \
build process."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python39-nbsphinx-0.9.2-1.1.noarch.rpm"
RPM_HASH = "1b213e60884892b8bd2c0eb5fdb3d375538fc59a901a7e1ca1e6d21ca35b7222fff0febd0ab018197ac5ed65221d376ebca58ac070df3f5b2cbeb8fb56da5f57"
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
