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

RPM_NAME = "vtk-openmpi2-java-devel-9.2.6-2.2.aarch64.rpm"
RPM_HASH = "720c22c7c1eac1b71c5f6718a8a4b74f0f8e1cd2609417d28beca9ba8e55d4bb3d8703ae488c0fee41a3f7c2bd65a505fe4c90dfc59e1beedef447e1f10b1af7"

RPROVIDES:${PN} += "vtk-openmpi2-devel:/usr/lib64/mpi/gcc/openmpi2/lib64//libvtkJava.so \
vtk-openmpi2-java-devel \
vtk-openmpi2-java-devel(aarch-64)"

RDEPENDS:${PN} += "java-devel \
vtk-openmpi2-devel \
vtk-openmpi2-java"

inherit rpm
