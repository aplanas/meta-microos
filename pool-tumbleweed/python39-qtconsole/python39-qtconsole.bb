SUMMARY = "Jupyter Qt console"
DESCRIPTION = "A rich Qt-based console for working with Jupyter kernels, \
supporting rich media output, session export, and more."
LICENSE = "BSD-3-Clause"

PV = "5.4.3"

RPM_NAME = "python39-qtconsole-5.4.3-1.2.noarch.rpm"
RPM_HASH = "30560fcf6456484d49532359444d8716d36030e730551be67a12a6197f942ed940dcd37c69d00f6abeb0416463899e2e35de8c767f90d0987c3e7218773d2675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-qtconsole \
python39-jupyter-qtconsole \
python39-qtconsole \
python3dist-qtconsole"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
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
