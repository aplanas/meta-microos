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

RPM_NAME = "vtk-openmpi4-java-devel-9.2.6-2.5.aarch64.rpm"
RPM_HASH = "fcf50bd407ee844e4ee5b3fbd3292ce69f1f8cdfb0c93f49570cc4a516176fdbff645ab6af54b35570d5711bf629d70527f646217bc0a735e5403537dff69fae"

RPROVIDES:${PN} += "vtk-openmpi4-devel-/usr/lib64/mpi/gcc/openmpi4/lib64//libvtkJava.so \
vtk-openmpi4-java-devel"

RDEPENDS:${PN} += "java-devel \
vtk-openmpi4-devel \
vtk-openmpi4-java"

inherit rpm
