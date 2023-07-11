SUMMARY = "Jupyter protocol implementation and client libraries"
DESCRIPTION = "This package contains the reference implementation of the Jupyter protocol. \
It also provides client and kernel management APIs for working with kernels. \
 \
It also provides the jupyter kernelspec entrypoint for installing kernelspecs \
for use with Jupyter frontends."
LICENSE = "BSD-3-Clause"

PV = "8.3.0"

RPM_NAME = "python311-jupyter-client-8.3.0-1.1.noarch.rpm"
RPM_HASH = "2705a3c529e9bdc85c5ebee2fbf4d7b43867ee1008e6de17653a07ec4d0984d6d08961c9b3130dafaaf7b7245bfe41af90e277815bbff24a1ab6ad1f5fadfeb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-client \
jupyter-jupyter-client-doc \
python3-jupyter-client \
python3.11dist-jupyter-client \
python311-jupyter-client \
python3dist-jupyter-client"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-python-dateutil \
python311-pyzmq \
python311-tornado \
python311-traitlets \
update-alternatives"

inherit rpm
