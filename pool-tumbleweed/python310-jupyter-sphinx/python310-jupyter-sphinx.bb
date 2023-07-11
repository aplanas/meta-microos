SUMMARY = "Jupyter Sphinx Extensions"
DESCRIPTION = "Jupyter Sphinx extensions enable jupyter-specific features in sphinx."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python310-jupyter-sphinx-0.4.0-1.6.noarch.rpm"
RPM_HASH = "f239ab6386c9639e0a8e9dc68b9acdd08c622d766f02e5d94bfe493c98ad5c3a4fcffbb48ffd3664ef3481ac8b2337e689965fe9d8a209a3a94c314e8c172366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyter-sphinx \
python310-jupyter-sphinx \
python3dist-jupyter-sphinx"

RDEPENDS:${PN} += "python-abi \
python310-IPython \
python310-Sphinx \
python310-ipywidgets \
python310-nbconvert \
python310-nbformat"

inherit rpm
