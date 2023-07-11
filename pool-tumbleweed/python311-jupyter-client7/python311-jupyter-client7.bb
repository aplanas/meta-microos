SUMMARY = "Jupyter protocol implementation and client libraries"
DESCRIPTION = "This package contains the reference implementation of the Jupyter protocol. \
It also provides client and kernel management APIs for working with kernels. \
 \
It also provides the jupyter kernelspec entrypoint for installing kernelspecs \
for use with Jupyter frontends."
LICENSE = "BSD-3-Clause"

PV = "7.4.9"

RPM_NAME = "python311-jupyter-client7-7.4.9-2.3.noarch.rpm"
RPM_HASH = "aa36e9d0b704fc92864cd723f70be9f6eb3b31d84cb53b1c6dbf55ec27fb8b12dd8547134cb24ac02765f3ad3cef9051b3504237fd1b2632563342e0b899e91d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-client \
jupyter-jupyter-client-doc \
jupyter-jupyter-client7 \
python3-jupyter-client \
python3-jupyter-client7 \
python3.11dist-jupyter-client \
python311-jupyter-client \
python311-jupyter-client7 \
python3dist-jupyter-client"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-entrypoints \
python311-jupyter-core \
python311-nest-asyncio \
python311-python-dateutil \
python311-pyzmq \
python311-tornado \
python311-traitlets \
update-alternatives"

inherit rpm
