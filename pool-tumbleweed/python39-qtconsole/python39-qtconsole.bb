SUMMARY = "Jupyter Qt console"
DESCRIPTION = "A rich Qt-based console for working with Jupyter kernels, \
supporting rich media output, session export, and more."
LICENSE = "BSD-3-Clause"

PV = "5.4.3"

RPM_NAME = "python39-qtconsole-5.4.3-1.1.noarch.rpm"
RPM_HASH = "bfd52223dd80084f1f074a5acde806f9f7237033c7206aa784ffe492881949b7484ddbe539be14d40a9cc2ec5562e912c2365144414753a8f55dfb3cdd49a43a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-qtconsole \
python39-jupyter-qtconsole \
python39-qtconsole \
python3dist-qtconsole"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
alts \
python-abi \
python39-Pygments \
python39-QtPy \
python39-ipykernel \
python39-ipython-genutils \
python39-jupyter-client \
python39-jupyter-core \
python39-packaging \
python39-pyzmq \
python39-traitlets"

inherit rpm
