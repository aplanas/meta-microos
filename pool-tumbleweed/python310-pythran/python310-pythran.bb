SUMMARY = "Ahead of Time compiler for numeric kernels"
DESCRIPTION = "Ahead of Time compiler for numeric kernels"
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python310-pythran-0.13.1-2.2.noarch.rpm"
RPM_HASH = "7e67c2dfaa755c5b3e92977f8ab7f2ae22ed103433806478ec7a2bdfcf9a0733dea56bc07c07af818cc940277b0de2204a71924458b22aafabfd9b070111d00c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pythran \
python310-pythran \
python3dist-pythran"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
boost-devel \
gcc-c++ \
openblas-devel \
python-abi \
python310-beniget \
python310-devel \
python310-gast \
python310-numpy-devel \
python310-ply \
update-alternatives"

inherit rpm
