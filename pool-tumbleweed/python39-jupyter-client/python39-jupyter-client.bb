SUMMARY = "Jupyter protocol implementation and client libraries"
DESCRIPTION = "This package contains the reference implementation of the Jupyter protocol. \
It also provides client and kernel management APIs for working with kernels. \
 \
It also provides the jupyter kernelspec entrypoint for installing kernelspecs \
for use with Jupyter frontends."
LICENSE = "BSD-3-Clause"

PV = "8.2.0"

RPM_NAME = "python39-jupyter-client-8.2.0-1.1.noarch.rpm"
RPM_HASH = "72260e89d8c07b11ba0ab8fcb31b1a8ed454db1db26dca8bd106685c44e28b547f2bf2d088ca0bbd778ce098e0680eb105d663e9eca33a4766a3adec89e91fd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-client \
jupyter-jupyter-client-doc \
python3.9dist-jupyter-client \
python39-jupyter-client \
python3dist-jupyter-client"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-entrypoints \
python39-python-dateutil \
python39-pyzmq \
python39-tornado \
python39-traitlets \
update-alternatives"

inherit rpm
