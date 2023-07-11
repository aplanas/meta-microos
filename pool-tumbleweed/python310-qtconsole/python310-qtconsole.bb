SUMMARY = "Jupyter Qt console"
DESCRIPTION = "A rich Qt-based console for working with Jupyter kernels, \
supporting rich media output, session export, and more."
LICENSE = "BSD-3-Clause"

PV = "5.4.3"

RPM_NAME = "python310-qtconsole-5.4.3-1.2.noarch.rpm"
RPM_HASH = "c4dbfdd9c70b3b85c28bc31aabbb144ceff539f7744b9e2b71e4e5d89baa995e5f81b702c4d23d40d56e9ea47e08f7bfc410a19fd10608931d5ce5159a9429d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-qtconsole \
python310-jupyter-qtconsole \
python310-qtconsole \
python3dist-qtconsole"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
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
