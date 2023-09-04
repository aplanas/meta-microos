SUMMARY = "Ahead of Time compiler for numeric kernels"
DESCRIPTION = "Ahead of Time compiler for numeric kernels"
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python311-pythran-0.13.1-4.1.noarch.rpm"
RPM_HASH = "0ed8b92764c966ae97102bf1f3a53f5b252eb6dc038585121ed211ce6780ff589ee883b5ef12ba12476855e3cb1880326b63582f34cfd2dfb9aa5e5f566ea265"
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
