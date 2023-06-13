SUMMARY = "Visualization ToolKit for Many-cores (vtk-m) development libraries"
DESCRIPTION = "VTK-m is a toolkit of scientific visualization algorithms for emerging \
processor architectures. \
 \
This provides development libraries and header files required to compile C++ \
programs that use VTK-m to do 3D visualization."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "vtk-m-openmpi3-devel-2.0.0-1.1.aarch64.rpm"
RPM_HASH = "5f07fd34891d615e3d8a05c8c850a1d89bc905de574fed0a10275ee3e7a0a7a2d43ad5c673df34ce7e44f98ab4d0f31647dcf04a86be75f11dac0a1aa3a317cf"

RPROVIDES:${PN} += "vtk-m-openmpi3-devel \
vtk-m-openmpi3-devel(aarch-64)"

RDEPENDS:${PN} += "cmake \
libvtk-m-openmpi3-2_0 \
openmpi3-devel"

inherit rpm
