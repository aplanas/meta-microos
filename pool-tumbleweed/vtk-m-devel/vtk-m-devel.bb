SUMMARY = "Visualization ToolKit for Many-cores (vtk-m) development libraries"
DESCRIPTION = "VTK-m is a toolkit of scientific visualization algorithms for emerging \
processor architectures. \
 \
This provides development libraries and header files required to compile C++ \
programs that use VTK-m to do 3D visualization."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "vtk-m-devel-2.0.0-1.2.aarch64.rpm"
RPM_HASH = "2b412fea33e02e0d0c6beee9439bdb1540795bdf85198c8868327478fc1a27c9acfa3abb86902bbe4776d1eac372eafb7da30537f94473ca5cb1f602fe0a46c8"

RPROVIDES:${PN} += "cmake-VTKm \
vtk-m-devel"

RDEPENDS:${PN} += "cmake \
libvtk-m-2-0"

inherit rpm
