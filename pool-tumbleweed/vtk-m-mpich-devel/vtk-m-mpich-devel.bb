SUMMARY = "Visualization ToolKit for Many-cores (vtk-m) development libraries"
DESCRIPTION = "VTK-m is a toolkit of scientific visualization algorithms for emerging \
processor architectures. \
 \
This provides development libraries and header files required to compile C++ \
programs that use VTK-m to do 3D visualization."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "vtk-m-mpich-devel-2.0.0-1.2.aarch64.rpm"
RPM_HASH = "7d6ad04bb75390b80ab01b4524f66096136e16309d8b677e10f32288312fef95a1636eea3f543eca8706b073108d175a8c9be8dce7f3f33b7482000f673e40ff"

RPROVIDES:${PN} += "vtk-m-mpich-devel"

RDEPENDS:${PN} += "cmake \
libvtk-m-mpich-2-0 \
mpich-devel"

inherit rpm
