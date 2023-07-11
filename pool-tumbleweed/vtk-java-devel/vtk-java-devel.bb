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

RPM_NAME = "vtk-java-devel-9.2.6-2.5.aarch64.rpm"
RPM_HASH = "399a3e36bab32d44aee63ad41cd4a4068a00e185226e56381e84519826b28c9d70193400bb0c922138f839fa6f54a355a9e9aae7f4b2ba309505dc1044ace930"

RPROVIDES:${PN} += "vtk-devel-/usr/lib64/libvtkJava.so \
vtk-java-devel"

RDEPENDS:${PN} += "java-devel \
vtk-devel \
vtk-java"

inherit rpm
