SUMMARY = "Jupyter protocol implementation and client libraries"
DESCRIPTION = "This package contains the reference implementation of the Jupyter protocol. \
It also provides client and kernel management APIs for working with kernels. \
 \
It also provides the jupyter kernelspec entrypoint for installing kernelspecs \
for use with Jupyter frontends."
LICENSE = "BSD-3-Clause"

PV = "7.4.9"

RPM_NAME = "python39-jupyter-client7-7.4.9-2.3.noarch.rpm"
RPM_HASH = "e7863105483419d51656e394942f950510b81ca42061a7f25467c0ae6a51b5c2f3e688f835551bc245671edb17456ee3c693af1d031308c7b061c7496b7bca79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-client \
jupyter-jupyter-client-doc \
jupyter-jupyter-client7 \
python3.9dist-jupyter-client \
python39-jupyter-client \
python39-jupyter-client7 \
python3dist-jupyter-client"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-entrypoints \
python39-jupyter-core \
python39-nest-asyncio \
python39-python-dateutil \
python39-pyzmq \
python39-tornado \
python39-traitlets \
update-alternatives"

inherit rpm
