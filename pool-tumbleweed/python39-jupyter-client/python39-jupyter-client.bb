SUMMARY = "Jupyter protocol implementation and client libraries"
DESCRIPTION = "This package contains the reference implementation of the Jupyter protocol. \
It also provides client and kernel management APIs for working with kernels. \
 \
It also provides the jupyter kernelspec entrypoint for installing kernelspecs \
for use with Jupyter frontends."
LICENSE = "BSD-3-Clause"

PV = "8.3.0"

RPM_NAME = "python39-jupyter-client-8.3.0-1.1.noarch.rpm"
RPM_HASH = "2becf7abf97fbc61ed3d0c17624b4ff249478dd63d7a428647a5a638c8c13f30f3d3ba771874671b82cec13d99ebce7a52fbaf7b66d3d3e55bea07497af64784"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-client \
jupyter-jupyter-client-doc \
python3.9dist-jupyter-client \
python39-jupyter-client \
python3dist-jupyter-client"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-python-dateutil \
python39-pyzmq \
python39-tornado \
python39-traitlets \
update-alternatives"

inherit rpm
