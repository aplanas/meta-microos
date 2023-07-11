SUMMARY = "Visualization ToolKit for Many-cores (vtk-m) development libraries"
DESCRIPTION = "VTK-m is a toolkit of scientific visualization algorithms for emerging \
processor architectures. \
 \
This provides development libraries and header files required to compile C++ \
programs that use VTK-m to do 3D visualization."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "vtk-m-openmpi4-devel-2.0.0-1.2.aarch64.rpm"
RPM_HASH = "61d868913bc73ee68cac350650f808a252c84d9a0a9cc9e6526a4fddb00b6c78c2a6f0c1628803681ccd4e9678c8c42873eb45812c8f16b62f576e14e9ce3a71"

RPROVIDES:${PN} += "vtk-m-openmpi4-devel"

RDEPENDS:${PN} += "cmake \
libvtk-m-openmpi4-2-0 \
openmpi4-devel"

inherit rpm
