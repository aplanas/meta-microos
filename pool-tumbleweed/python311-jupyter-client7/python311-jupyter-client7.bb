SUMMARY = "Jupyter protocol implementation and client libraries"
DESCRIPTION = "This package contains the reference implementation of the Jupyter protocol. \
It also provides client and kernel management APIs for working with kernels. \
 \
It also provides the jupyter kernelspec entrypoint for installing kernelspecs \
for use with Jupyter frontends."
LICENSE = "BSD-3-Clause"

PV = "7.4.9"

RPM_NAME = "python311-jupyter-client7-7.4.9-2.1.noarch.rpm"
RPM_HASH = "d7d47f69dd05564b6ad1ca9a895296a5fddb54c983e020e4e560a94545b3b9fc1d44536f41c35082e2c18e936fe004a7904b038d1c23b1163d59a3293763ffb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-client \
jupyter-jupyter-client-doc \
jupyter-jupyter-client7 \
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
