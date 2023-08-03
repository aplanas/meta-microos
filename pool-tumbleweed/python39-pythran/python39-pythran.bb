SUMMARY = "Ahead of Time compiler for numeric kernels"
DESCRIPTION = "Ahead of Time compiler for numeric kernels"
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python39-pythran-0.13.1-3.1.noarch.rpm"
RPM_HASH = "de1e5dd5cefb275479a02713080d0ee0b99ec20667e833626b697bc18a73c7e9b6a7d07750ca8a016a6bf3251b43c8d87d00f28257ed841ad0ca14ce3842c2f8"
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
