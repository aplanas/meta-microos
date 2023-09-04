SUMMARY = "Jupyter Sphinx Extensions"
DESCRIPTION = "Jupyter Sphinx extensions enable jupyter-specific features in sphinx."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python310-jupyter-sphinx-0.4.0-2.1.noarch.rpm"
RPM_HASH = "16e1aa625fd8b72957320697c0f3f3b8987afb8aac8285de32008e5ccdf8b194c94558264a31172e34ba52a915f81c335f63502a212c18547c95c002e2d8c08d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyter-sphinx \
python310-jupyter-sphinx \
python3dist-jupyter-sphinx"

RDEPENDS:${PN} += "python-abi \
python310-IPython \
python310-Sphinx \
python310-ipykernel \
python310-ipywidgets \
python310-nbconvert \
python310-nbformat"

inherit rpm
