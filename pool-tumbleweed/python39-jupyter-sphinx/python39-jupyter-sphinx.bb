SUMMARY = "Jupyter Sphinx Extensions"
DESCRIPTION = "Jupyter Sphinx extensions enable jupyter-specific features in sphinx."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python39-jupyter-sphinx-0.4.0-1.5.noarch.rpm"
RPM_HASH = "e7cfd64960d0a82bc558438bbc3f3422bd3d5ee3aa8c58bef1d8e321e5ad939c3b1dd091cd9b1c13ea6782a8ac4285c5cb801a3b909ac0c4a1b9e8ee65d0886a"
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
