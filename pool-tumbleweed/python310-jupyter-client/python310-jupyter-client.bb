SUMMARY = "Jupyter protocol implementation and client libraries"
DESCRIPTION = "This package contains the reference implementation of the Jupyter protocol. \
It also provides client and kernel management APIs for working with kernels. \
 \
It also provides the jupyter kernelspec entrypoint for installing kernelspecs \
for use with Jupyter frontends."
LICENSE = "BSD-3-Clause"

PV = "8.3.0"

RPM_NAME = "python310-jupyter-client-8.3.0-1.1.noarch.rpm"
RPM_HASH = "9df0d02da48538fe9239f3a78d7bc9ce061d930d0d7f7e6b13869a98b6518decdfc0fded4a6ce1faebde7026451a7ab989788e74fcf72aee63ea0ef7b11cbad6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-client \
jupyter-jupyter-client-doc \
python3.10dist-jupyter-client \
python310-jupyter-client \
python3dist-jupyter-client"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-python-dateutil \
python310-pyzmq \
python310-tornado \
python310-traitlets \
update-alternatives"

inherit rpm
