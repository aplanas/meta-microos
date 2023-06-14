SUMMARY = "Visualization ToolKit for Many-cores (vtk-m) development libraries"
DESCRIPTION = "VTK-m is a toolkit of scientific visualization algorithms for emerging \
processor architectures. \
 \
This provides development libraries and header files required to compile C++ \
programs that use VTK-m to do 3D visualization."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "vtk-m-devel-2.0.0-1.1.aarch64.rpm"
RPM_HASH = "12a12017bedd59a857d6336b697f767203a704855afc42daf15f6394ab55f875ded272c8bcb259e28552822dff1418a56137d471e744de783f8bb0718cf19399"

RPROVIDES:${PN} += "cmake-VTKm \
vtk-m-devel"

RDEPENDS:${PN} += "cmake \
libvtk-m-2-0"

inherit rpm
