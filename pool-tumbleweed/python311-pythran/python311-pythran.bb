SUMMARY = "Ahead of Time compiler for numeric kernels"
DESCRIPTION = "Ahead of Time compiler for numeric kernels"
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python311-pythran-0.13.1-3.1.noarch.rpm"
RPM_HASH = "28e1e4639223d96806e0e8b959f62ac2620eea6854d94438e1e490296608ff30f38905248ded75d0261f7009edec19ac08c586c9386db856def5a6bd545db822"
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
