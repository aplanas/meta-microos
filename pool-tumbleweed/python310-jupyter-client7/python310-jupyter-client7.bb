SUMMARY = "Jupyter protocol implementation and client libraries"
DESCRIPTION = "This package contains the reference implementation of the Jupyter protocol. \
It also provides client and kernel management APIs for working with kernels. \
 \
It also provides the jupyter kernelspec entrypoint for installing kernelspecs \
for use with Jupyter frontends."
LICENSE = "BSD-3-Clause"

PV = "7.4.9"

RPM_NAME = "python310-jupyter-client7-7.4.9-2.1.noarch.rpm"
RPM_HASH = "ab369ddddd65484b78c78b4f53ade1d79b4064510d9186753bbb61f11b9461d8447e30ca55d8797025168251279adcaedfe2cc702d7ee10d19079a00d00ed9f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-client \
jupyter-jupyter-client-doc \
jupyter-jupyter-client7 \
jupyter-jupyter_client \
python3-jupyter-client \
python3-jupyter-client7 \
python3-jupyter_client \
python3.10dist(jupyter-client) \
python310-jupyter-client \
python310-jupyter-client7 \
python310-jupyter_client \
python3dist(jupyter-client)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-entrypoints \
python310-jupyter-core \
python310-nest-asyncio \
python310-python-dateutil \
python310-pyzmq \
python310-tornado \
python310-traitlets \
update-alternatives"

inherit rpm
