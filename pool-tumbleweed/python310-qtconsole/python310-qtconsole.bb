SUMMARY = "Jupyter Qt console"
DESCRIPTION = "A rich Qt-based console for working with Jupyter kernels, \
supporting rich media output, session export, and more."
LICENSE = "BSD-3-Clause"

PV = "5.4.3"

RPM_NAME = "python310-qtconsole-5.4.3-1.1.noarch.rpm"
RPM_HASH = "a8c27c08255dc93119f035cd6ac7f8b06ec175ca8b83b624c0beb3b8e04361761913874af354774e56cb8437b48330470f65f09d2108474fdcd2e442aa3c6ab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-qtconsole \
python3-jupyter-qtconsole \
python3-qtconsole \
python3.10dist-qtconsole \
python310-jupyter-qtconsole \
python310-qtconsole \
python3dist-qtconsole"

RDEPENDS:${PN} += "-python310-qt5 or python310-pyside2 or python310-PyQt6 or python310-pyside6 \
/bin/sh \
/usr/bin/python3.10 \
alts \
python-abi \
python310-Pygments \
python310-QtPy \
python310-ipykernel \
python310-ipython-genutils \
python310-jupyter-client \
python310-jupyter-core \
python310-packaging \
python310-pyzmq \
python310-traitlets"

inherit rpm
