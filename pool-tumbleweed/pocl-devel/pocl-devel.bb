SUMMARY = "Development files for the Portable Computing Language"
DESCRIPTION = "Portable Computing Language (pocl) is an implementation of the OpenCL standard \
which can be adapted for new targets and devices, both for homogeneous CPU and \
heterogenous GPUs/accelerators. \
 \
This subpackage provides the development files needed for pocl."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "pocl-devel-3.1-3.1.aarch64.rpm"
RPM_HASH = "3f770ec318d40abf7c52f549b7f1abae01f2d805150e5eb0bfc89b3547dd159fca0d722867b7fcbc6ca8051c60634a42abc69048285e281c00520e5213f33c64"

RPROVIDES:${PN} += "pkgconfig(pocl) \
pocl-devel \
pocl-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpocl2 \
opencl-headers \
pocl"

inherit rpm
