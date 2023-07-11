SUMMARY = "Jupyter Qt console"
DESCRIPTION = "A rich Qt-based console for working with Jupyter kernels, \
supporting rich media output, session export, and more."
LICENSE = "BSD-3-Clause"

PV = "5.4.3"

RPM_NAME = "python311-qtconsole-5.4.3-1.2.noarch.rpm"
RPM_HASH = "cd47a74b2684ce3bde8bb03a9f8f451844f7a0c23b673dad9a3176fe3bebd92b0536589f9b1175a25b0478c55e0488d52ddbede045ff65f6c841567624e857a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-qtconsole \
python3-jupyter-qtconsole \
python3-qtconsole \
python3.11dist-qtconsole \
python311-jupyter-qtconsole \
python311-qtconsole \
python3dist-qtconsole"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-Pygments \
python311-QtPy \
python311-ipykernel \
python311-ipython-genutils \
python311-jupyter-client \
python311-jupyter-core \
python311-packaging \
python311-pyzmq \
python311-traitlets"

inherit rpm
