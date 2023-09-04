SUMMARY = "Jupyter Notebook Tools for Sphinx"
DESCRIPTION = "The nbsphinx package is a Sphinx extension that provides a source \
parser for *.ipynb files. Custom Sphinx directives are used to show \
Jupyter Notebook code cells (and of course their results) in both HTML \
and LaTeX output. Un-evaluated notebooks – i.e. notebooks without \
stored output cells – will be automatically executed during the Sphinx \
build process."
LICENSE = "MIT"

PV = "0.9.3"

RPM_NAME = "python39-nbsphinx-0.9.3-1.1.noarch.rpm"
RPM_HASH = "cdf3f526476d15c7219f51828cf1d9d54bcc9a08e6092df86c731a97c3ecce2ba3ef5d9dbc3b4aa8af7f159c92043401096ee25d4fef692c0773c92a2112f61d"
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
