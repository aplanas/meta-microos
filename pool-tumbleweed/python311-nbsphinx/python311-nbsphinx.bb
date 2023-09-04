SUMMARY = "Jupyter Notebook Tools for Sphinx"
DESCRIPTION = "The nbsphinx package is a Sphinx extension that provides a source \
parser for *.ipynb files. Custom Sphinx directives are used to show \
Jupyter Notebook code cells (and of course their results) in both HTML \
and LaTeX output. Un-evaluated notebooks – i.e. notebooks without \
stored output cells – will be automatically executed during the Sphinx \
build process."
LICENSE = "MIT"

PV = "0.9.3"

RPM_NAME = "python311-nbsphinx-0.9.3-1.1.noarch.rpm"
RPM_HASH = "3acb2ec760c5bcf8cde91611e4534db4dacaece773d02d6c6672085e32b2346ecfd39b88b506c07d811990bb479b77603a4e0660d3e9b17b9f879284684075f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbsphinx \
python3-jupyter-nbsphinx \
python3-nbsphinx \
python3.11dist-nbsphinx \
python311-jupyter-nbsphinx \
python311-nbsphinx \
python3dist-nbsphinx"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-Sphinx \
python311-docutils \
python311-nbconvert \
python311-nbformat \
python311-traitlets"

inherit rpm
