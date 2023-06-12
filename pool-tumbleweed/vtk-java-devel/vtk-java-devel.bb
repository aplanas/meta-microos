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

RPM_NAME = "vtk-java-devel-9.2.6-2.2.aarch64.rpm"
RPM_HASH = "4ff11707b5ec4661a0074a169e22af6481eb4150effdeaa8e65420810a14e54b6ce0f147a2024a8ac140c1dd8d7672b783b48831b20adc412471cc11a70d452d"

RPROVIDES:${PN} += "vtk-devel:/usr/lib64/libvtkJava.so \
vtk-java-devel \
vtk-java-devel(aarch-64)"
RDEPENDS:${PN} += "java-devel \
vtk-devel \
vtk-java"

inherit rpm
