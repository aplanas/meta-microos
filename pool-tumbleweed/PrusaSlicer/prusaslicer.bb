SUMMARY = "G-code generator for 3D printers (RepRap, Makerbot, Ultimaker etc.)"
DESCRIPTION = "PrusaSlicer takes 3D models (STL, OBJ, AMF) and converts them into G-code \
instructions for FFF printers or PNG layers for mSLA 3D printers. It's \
compatible with any modern printer based on the RepRap toolchain, including \
all those based on the Marlin, Prusa, Sprinter and Repetier firmware. \
It also works with Mach3, LinuxCNC and Machinekit controllers."
LICENSE = "AGPL-3.0-only"

PV = "2.6.0"

RPM_NAME = "PrusaSlicer-2.6.0-2.1.aarch64.rpm"
RPM_HASH = "e7a400e7e24f954bd49d5808e95001fd0b655638aba06fa6f2e2076d64ae2ad2e25874b445eceb4fcca244e2700e8c1bda090b8dbaf176f50c8c43f0accdb0b3"

RPROVIDES:${PN} += "PrusaSlicer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLEW.so.2.2 \
libTKBRep.so.7.7 \
libTKLCAF.so.7.7 \
libTKMath.so.7.7 \
libTKMesh.so.7.7 \
libTKTopAlgo.so.7.7 \
libTKXCAF.so.7.7 \
libTKXDESTEP.so.7.7 \
libTKernel.so.7.7 \
libboost-chrono.so.1.82.0 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-log.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libcurl.so.4 \
libdbus-1.so.3 \
libexpat.so.1 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgmp.so.10 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libmpfr.so.6 \
libnanosvgrast.so.0 \
libnlopt.so.0 \
libopenvdb.so.9.0 \
libpng16.so.16 \
libqhull-r.so.8.0 \
libstdc++.so.6 \
libtbb.so.12 \
libtbbmalloc.so.2 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0 \
libwx-gtk2u-gl-suse.so.9.0.0 \
libwx-gtk2u-html-suse.so.9.0.0 \
noto-sans-fonts"

inherit rpm
