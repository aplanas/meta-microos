SUMMARY = "Jupyter Notebook Tools for Sphinx"
DESCRIPTION = "The nbsphinx package is a Sphinx extension that provides a source \
parser for *.ipynb files. Custom Sphinx directives are used to show \
Jupyter Notebook code cells (and of course their results) in both HTML \
and LaTeX output. Un-evaluated notebooks – i.e. notebooks without \
stored output cells – will be automatically executed during the Sphinx \
build process."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python311-nbsphinx-0.9.2-1.2.noarch.rpm"
RPM_HASH = "5142886a78ea2b616fb48e99259bb7c3d5797321b6c5f6f1bb388d131dae60236a2b2882cdfa2e80707542287ea620b6a04a9ee40d3011cbd676802daaefcc87"
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
