SUMMARY = "Jupyter protocol implementation and client libraries"
DESCRIPTION = "This package contains the reference implementation of the Jupyter protocol. \
It also provides client and kernel management APIs for working with kernels. \
 \
It also provides the jupyter kernelspec entrypoint for installing kernelspecs \
for use with Jupyter frontends."
LICENSE = "BSD-3-Clause"

PV = "8.2.0"

RPM_NAME = "python311-jupyter-client-8.2.0-1.1.noarch.rpm"
RPM_HASH = "7cd1fb7dba19438288b2ad6008463c622de9826775531a0130d0479015c779e60b21b781833ee8b561290cf8f3ffba61fe86288aa03cc02f0ef3156f621ef417"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-client \
jupyter-jupyter-client-doc \
jupyter-jupyter_client \
python3.11dist(jupyter-client) \
python311-jupyter-client \
python311-jupyter_client \
python3dist(jupyter-client)"
RDEPENDS:${PN} += "(python311-importlib-metadata >= 4.8.3 if python311-base < 3.10) \
(python311-jupyter-core >= 5.1 or (python311-jupyter-core >= 4.12 with python311-jupyter-core < 5.0)) \
/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-entrypoints \
python311-python-dateutil \
python311-pyzmq \
python311-tornado \
python311-traitlets \
update-alternatives"

inherit rpm