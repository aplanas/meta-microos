SUMMARY = "Jupyter protocol implementation and client libraries"
DESCRIPTION = "This package contains the reference implementation of the Jupyter protocol. \
It also provides client and kernel management APIs for working with kernels. \
 \
It also provides the jupyter kernelspec entrypoint for installing kernelspecs \
for use with Jupyter frontends."
LICENSE = "BSD-3-Clause"

PV = "7.4.9"

RPM_NAME = "python310-jupyter-client7-7.4.9-2.3.noarch.rpm"
RPM_HASH = "80ce332aede10a0bebbfc5ef74d4f2e35c24d5ae00b4169826c6b572664598d3b455dc884bd15efb0c06b204f491443f67115acc9fa0c722bdd766e3f07f8f54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-client \
jupyter-jupyter-client-doc \
jupyter-jupyter-client7 \
python3.10dist-jupyter-client \
python310-jupyter-client \
python310-jupyter-client7 \
python3dist-jupyter-client"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-entrypoints \
python310-jupyter-core \
python310-nest-asyncio \
python310-python-dateutil \
python310-pyzmq \
python310-tornado \
python310-traitlets \
update-alternatives"

inherit rpm
