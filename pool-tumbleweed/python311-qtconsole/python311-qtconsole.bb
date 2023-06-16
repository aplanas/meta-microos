SUMMARY = "Jupyter Qt console"
DESCRIPTION = "A rich Qt-based console for working with Jupyter kernels, \
supporting rich media output, session export, and more."
LICENSE = "BSD-3-Clause"

PV = "5.4.3"

RPM_NAME = "python311-qtconsole-5.4.3-1.1.noarch.rpm"
RPM_HASH = "c72eaa24670b7dfdc7c7e085e7043f2e8627f8e3637ab69b41875aa8e107f5b31c49ad57cb192231971ca0a0251b0804927ff2c1eb71d0bb594b84e566123586"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-qtconsole \
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
