SUMMARY = "Jupyter Sphinx Extensions"
DESCRIPTION = "Jupyter Sphinx extensions enable jupyter-specific features in sphinx."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python39-jupyter-sphinx-0.4.0-2.1.noarch.rpm"
RPM_HASH = "13dce4d77da9524ddd974c9669a89342e4cf13a95f5e8e0a440c5eeab3a10a924c75c0c1492b89a736ad11f64e6407b41e45bc2e1e441cc26407f9fa71214be6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyter-sphinx \
python39-jupyter-sphinx \
python3dist-jupyter-sphinx"

RDEPENDS:${PN} += "python-abi \
python39-IPython \
python39-Sphinx \
python39-ipykernel \
python39-ipywidgets \
python39-nbconvert \
python39-nbformat"

inherit rpm
