SUMMARY = "Jupyter Sphinx Extensions"
DESCRIPTION = "Jupyter Sphinx extensions enable jupyter-specific features in sphinx."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python39-jupyter-sphinx-0.4.0-1.6.noarch.rpm"
RPM_HASH = "53e7b0781a1b6eb8a36c03ef0b5f55f7dcbac5b8c195397f41c8ac9c216c3085a9a27ef5a3be5fea8e76ff0d60e5dde3ad6a4365caf477882953ac7b912e8a26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyter-sphinx \
python39-jupyter-sphinx \
python3dist-jupyter-sphinx"

RDEPENDS:${PN} += "python-abi \
python39-IPython \
python39-Sphinx \
python39-ipywidgets \
python39-nbconvert \
python39-nbformat"

inherit rpm
