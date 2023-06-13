SUMMARY = "Ahead of Time compiler for numeric kernels"
DESCRIPTION = "Ahead of Time compiler for numeric kernels"
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python39-pythran-0.13.1-1.1.noarch.rpm"
RPM_HASH = "0bfd1d2f7476f1316b7b909147072b9acee2b278c7a9a91764cf94961012e6f7f1f2078f208693ac28e7c8e21972ee12cc6a5a6700060d7879205aa9c7cb27c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pythran) \
python39-pythran \
python3dist(pythran)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
boost-devel \
gcc-c++ \
openblas-devel \
python(abi) \
python39-beniget \
python39-devel \
python39-gast \
python39-numpy-devel \
python39-ply \
update-alternatives"

inherit rpm
