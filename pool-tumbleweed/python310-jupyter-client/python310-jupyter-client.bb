SUMMARY = "Jupyter protocol implementation and client libraries"
DESCRIPTION = "This package contains the reference implementation of the Jupyter protocol. \
It also provides client and kernel management APIs for working with kernels. \
 \
It also provides the jupyter kernelspec entrypoint for installing kernelspecs \
for use with Jupyter frontends."
LICENSE = "BSD-3-Clause"

PV = "8.2.0"

RPM_NAME = "python310-jupyter-client-8.2.0-1.1.noarch.rpm"
RPM_HASH = "8ca2de4a900020840b66792885d2ac5f926f6ea0f89895a3a5a9293ebfdc16a706aa6daf12011132940df1ce8bac958f80788789f629744c891d273044bcaa56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-client \
jupyter-jupyter-client-doc \
python3-jupyter-client \
python3.10dist-jupyter-client \
python310-jupyter-client \
python3dist-jupyter-client"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-entrypoints \
python310-python-dateutil \
python310-pyzmq \
python310-tornado \
python310-traitlets \
update-alternatives"

inherit rpm
