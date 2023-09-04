SUMMARY = "Ahead of Time compiler for numeric kernels"
DESCRIPTION = "Ahead of Time compiler for numeric kernels"
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python310-pythran-0.13.1-4.1.noarch.rpm"
RPM_HASH = "3e069498b4c8e9b621d256b3c2f0e32b9ef99ac56eed8e8f6144ce7edeb5ff5d340f646de55cbf6dca3cd2609bfda864497780687e163aa3afe6d9ce1591e88e"
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
