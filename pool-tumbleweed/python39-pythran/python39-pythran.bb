SUMMARY = "Ahead of Time compiler for numeric kernels"
DESCRIPTION = "Ahead of Time compiler for numeric kernels"
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python39-pythran-0.13.1-2.2.noarch.rpm"
RPM_HASH = "b99776599ec9f15c482833a2b1e7deb8c7b54e4244867411e6196ae4593a771a5c492e1b0f23a06eab3b4adc95ff775dce1ff947bcfe10385332341fe3f7e756"
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
