SUMMARY = "Ahead of Time compiler for numeric kernels"
DESCRIPTION = "Ahead of Time compiler for numeric kernels"
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python310-pythran-0.13.1-3.1.noarch.rpm"
RPM_HASH = "a4c1020370db48f277f9b51dc7bb174eb2fc27e26fee08548018ec4f299bcaa9d21f70ce404437945a84117fa92a2c73803a142eea93ae8ae5a0596296342caa"
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
