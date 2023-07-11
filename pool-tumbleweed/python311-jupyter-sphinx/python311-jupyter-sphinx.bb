SUMMARY = "Jupyter Sphinx Extensions"
DESCRIPTION = "Jupyter Sphinx extensions enable jupyter-specific features in sphinx."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python311-jupyter-sphinx-0.4.0-1.6.noarch.rpm"
RPM_HASH = "db61f469549cad318036992f03e369b4a2c6ee3fbc910327d6020c800e74041794a29ae0eb128c75306bfbe97d35e34735085ebe842ed1b3aa92e5472fced3a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-sphinx \
python3-jupyter-sphinx \
python3.11dist-jupyter-sphinx \
python311-jupyter-sphinx \
python3dist-jupyter-sphinx"

RDEPENDS:${PN} += "python-abi \
python311-IPython \
python311-Sphinx \
python311-ipywidgets \
python311-nbconvert \
python311-nbformat"

inherit rpm
