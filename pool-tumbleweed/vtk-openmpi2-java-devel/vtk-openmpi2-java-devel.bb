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

RPM_NAME = "vtk-openmpi2-java-devel-9.2.6-2.5.aarch64.rpm"
RPM_HASH = "49237effb74eb313728f87b7bf9e4563add4660cbb83781e0b87de3e8e29dc9b1af89f0c67c250766aef7fe9676dcfbc3ffe1df7129f45b043f20965f0e86fe2"

RPROVIDES:${PN} += "vtk-openmpi2-devel-/usr/lib64/mpi/gcc/openmpi2/lib64//libvtkJava.so \
vtk-openmpi2-java-devel"

RDEPENDS:${PN} += "java-devel \
vtk-openmpi2-devel \
vtk-openmpi2-java"

inherit rpm
