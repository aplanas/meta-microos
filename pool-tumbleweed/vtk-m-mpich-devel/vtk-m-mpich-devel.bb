SUMMARY = "Visualization ToolKit for Many-cores (vtk-m) development libraries"
DESCRIPTION = "VTK-m is a toolkit of scientific visualization algorithms for emerging \
processor architectures. \
 \
This provides development libraries and header files required to compile C++ \
programs that use VTK-m to do 3D visualization."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "vtk-m-mpich-devel-2.0.0-1.1.aarch64.rpm"
RPM_HASH = "e0f8b58aa760094a61548fef8dc27d8c5239db60113d8bbb801c7367acefc7253d32b9efa4470efb43e3cfedbafd17c9d39ab47d1c351f9674a721360b955973"

RPROVIDES:${PN} += "vtk-m-mpich-devel"

RDEPENDS:${PN} += "cmake \
libvtk-m-mpich-2-0 \
mpich-devel"

inherit rpm
