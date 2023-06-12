SUMMARY = "Develoment files for VTK Java bindings"
DESCRIPTION = "VTK is a software system for image processing, 3D graphics, volume \
rendering and visualization. VTK includes many advanced algorithms \
(e.g. surface reconstruction, implicit modelling, decimation) and \
rendering techniques (e.g. hardware-accelerated volume rendering, \
LOD control). \
 \
This provides the Java part of the development files."
LICENSE = "BSD-3-Clause"

PV = "9.2.6"

RPM_NAME = "vtk-openmpi3-java-devel-9.2.6-2.2.aarch64.rpm"
RPM_HASH = "7a310391bfa3abffd9d3d358b332ea6127a42129c419cf006a8b8d0a60944e3a931b4e41fa6375805a28e850cf5e05f337bc5f0533cde81b4121b41029645b3f"

RPROVIDES:${PN} += "vtk-openmpi3-devel:/usr/lib64/mpi/gcc/openmpi3/lib64//libvtkJava.so \
vtk-openmpi3-java-devel \
vtk-openmpi3-java-devel(aarch-64)"
RDEPENDS:${PN} += "java-devel \
vtk-openmpi3-devel \
vtk-openmpi3-java"

inherit rpm
