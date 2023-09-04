SUMMARY = "Ahead of Time compiler for numeric kernels"
DESCRIPTION = "Ahead of Time compiler for numeric kernels"
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python39-pythran-0.13.1-4.1.noarch.rpm"
RPM_HASH = "136622d3423119144412c88c22ea734eb57a0afbc32c6cebd003d20fd54c2fc8daa400f147a67d8228a70d098e46a607b758e4591dea2b396485ba60a4410444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pythran \
python39-pythran \
python3dist-pythran"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
boost-devel \
gcc-c++ \
openblas-devel \
python-abi \
python39-beniget \
python39-devel \
python39-gast \
python39-numpy-devel \
python39-ply \
update-alternatives"

inherit rpm
