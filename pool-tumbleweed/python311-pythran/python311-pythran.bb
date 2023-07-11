SUMMARY = "Ahead of Time compiler for numeric kernels"
DESCRIPTION = "Ahead of Time compiler for numeric kernels"
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python311-pythran-0.13.1-2.2.noarch.rpm"
RPM_HASH = "2c4c0b852703d6b4dcb3b54dbeac4d93b972d4b106799fff7c9a703bee90d6726c5a1ed8ce65f9f90df4fc7e687eda47e3af3d6721516cc6a7cafca8fb19d652"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pythran \
python3.11dist-pythran \
python311-pythran \
python3dist-pythran"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
boost-devel \
gcc-c++ \
openblas-devel \
python-abi \
python311-beniget \
python311-devel \
python311-gast \
python311-numpy-devel \
python311-ply \
update-alternatives"

inherit rpm
