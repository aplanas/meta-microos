SUMMARY = "Ahead of Time compiler for numeric kernels"
DESCRIPTION = "Ahead of Time compiler for numeric kernels"
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python310-pythran-0.13.1-1.1.noarch.rpm"
RPM_HASH = "3bcd94801aa472488e4b6fd5721f02c2253ca0cb7f742e441d4f353fa678620d4bbfb463209fa1f36915a0b5effd9e0d22036a85ed0c3bb72d01407c1d73539e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pythran \
python3.10dist(pythran) \
python310-pythran \
python3dist(pythran)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
boost-devel \
gcc-c++ \
openblas-devel \
python(abi) \
python310-beniget \
python310-devel \
python310-gast \
python310-numpy-devel \
python310-ply \
update-alternatives"

inherit rpm
