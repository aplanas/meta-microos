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

RPM_NAME = "vtk-openmpi3-java-devel-9.2.6-2.5.aarch64.rpm"
RPM_HASH = "6431e4000a7fba2699a968aa030893f26501e5c74fc6b184feb3ccec33323607bb477e585f6aeea973fc378231d82f51679159fa092fcff8653498376338a4ca"

RPROVIDES:${PN} += "vtk-openmpi3-devel-/usr/lib64/mpi/gcc/openmpi3/lib64//libvtkJava.so \
vtk-openmpi3-java-devel"

RDEPENDS:${PN} += "java-devel \
vtk-openmpi3-devel \
vtk-openmpi3-java"

inherit rpm
