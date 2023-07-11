SUMMARY = "Visualization ToolKit for Many-cores (vtk-m) development libraries"
DESCRIPTION = "VTK-m is a toolkit of scientific visualization algorithms for emerging \
processor architectures. \
 \
This provides development libraries and header files required to compile C++ \
programs that use VTK-m to do 3D visualization."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "vtk-m-openmpi3-devel-2.0.0-1.2.aarch64.rpm"
RPM_HASH = "1f8c03d88950643d0730eb356c52be8659f25aa8959adcadf07f671fe1ef0aa51bae05db6ecd12e52b65d2ffef9705b456e601ba6be9cfade4c511d1a8330153"

RPROVIDES:${PN} += "vtk-m-openmpi3-devel"

RDEPENDS:${PN} += "cmake \
libvtk-m-openmpi3-2-0 \
openmpi3-devel"

inherit rpm
