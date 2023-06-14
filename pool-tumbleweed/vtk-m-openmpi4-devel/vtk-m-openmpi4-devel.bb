SUMMARY = "Visualization ToolKit for Many-cores (vtk-m) development libraries"
DESCRIPTION = "VTK-m is a toolkit of scientific visualization algorithms for emerging \
processor architectures. \
 \
This provides development libraries and header files required to compile C++ \
programs that use VTK-m to do 3D visualization."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "vtk-m-openmpi4-devel-2.0.0-1.1.aarch64.rpm"
RPM_HASH = "9f997a6a36dacf43fbe505bf05274ec8e45c91581055334735703aa75cd80f601085704c7e2182c3b8df07a3c7402021291f70527c9f74ab63dc944836f3e1e2"

RPROVIDES:${PN} += "vtk-m-openmpi4-devel"

RDEPENDS:${PN} += "cmake \
libvtk-m-openmpi4-2-0 \
openmpi4-devel"

inherit rpm
