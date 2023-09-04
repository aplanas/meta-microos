SUMMARY = "Jupyter Sphinx Extensions"
DESCRIPTION = "Jupyter Sphinx extensions enable jupyter-specific features in sphinx."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python311-jupyter-sphinx-0.4.0-2.1.noarch.rpm"
RPM_HASH = "a5829e81550abc250ebe01964cd067ed04f6fb064d5919eedde0886d1e4925d68c5eac1a59ef94fb2619cab4c26ae814df74dfe901afb9b9f7e73871f27e270b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-sphinx \
python3-jupyter-sphinx \
python3.11dist-jupyter-sphinx \
python311-jupyter-sphinx \
python3dist-jupyter-sphinx"

RDEPENDS:${PN} += "python-abi \
python311-IPython \
python311-Sphinx \
python311-ipykernel \
python311-ipywidgets \
python311-nbconvert \
python311-nbformat"

inherit rpm
