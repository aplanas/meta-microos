SUMMARY = "Ahead of Time compiler for numeric kernels"
DESCRIPTION = "Ahead of Time compiler for numeric kernels"
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python311-pythran-0.13.1-1.1.noarch.rpm"
RPM_HASH = "07bb06666d181c0cbb88b9dee1b8ba49d073314eb830f9b9ab54e18dd60a46276b8522ee0f03e645382813d5ae06d89d9fe8aa1fea2c9bea85181878b1c85f66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pythran) \
python311-pythran \
python3dist(pythran)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
boost-devel \
gcc-c++ \
openblas-devel \
python(abi) \
python311-beniget \
python311-devel \
python311-gast \
python311-numpy-devel \
python311-ply \
update-alternatives"

inherit rpm
