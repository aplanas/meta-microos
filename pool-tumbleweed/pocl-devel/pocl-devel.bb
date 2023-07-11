SUMMARY = "Development files for the Portable Computing Language"
DESCRIPTION = "Portable Computing Language (pocl) is an implementation of the OpenCL standard \
which can be adapted for new targets and devices, both for homogeneous CPU and \
heterogenous GPUs/accelerators. \
 \
This subpackage provides the development files needed for pocl."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "pocl-devel-3.1-3.2.aarch64.rpm"
RPM_HASH = "38306b263f180acf28f15b1bb699643e2889fd042b1d09d7a816abd463f7d58b1951140799841d99ebbdc4ea88032c18aa68f529239650c14d3d3fd50da08b24"

RPROVIDES:${PN} += "pkgconfig-pocl \
pocl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpocl2 \
opencl-headers \
pocl"

inherit rpm
