SUMMARY = "G-code generator for 3D printers (RepRap, Makerbot, Ultimaker etc.)"
DESCRIPTION = "PrusaSlicer takes 3D models (STL, OBJ, AMF) and converts them into G-code \
instructions for FFF printers or PNG layers for mSLA 3D printers. It's \
compatible with any modern printer based on the RepRap toolchain, including \
all those based on the Marlin, Prusa, Sprinter and Repetier firmware. \
It also works with Mach3, LinuxCNC and Machinekit controllers."
LICENSE = "AGPL-3.0-only"

PV = "2.5.2"

RPM_NAME = "PrusaSlicer-2.5.2-1.2.aarch64.rpm"
RPM_HASH = "f78417924c10274936e2b8f45a723c5d85792986911bf05352e6e9a25de3bcd3849e5a0301fa832d749e350cb9796f9524c00eb54cb2abd8f006bd5628a90214"

RPROVIDES:${PN} += "PrusaSlicer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
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
libboost-locale.so.1.82.0 \
libboost-log.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libcurl.so.4 \
libdbus-1.so.3 \
libexpat.so.1 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgmp.so.10 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libmpfr.so.6 \
libnlopt.so.0 \
libopenvdb.so.9.0 \
libpng16.so.16 \
libstdc++.so.6 \
libtbb.so.12 \
libwx-baseu-suse.so.3.0.5 \
libwx-gtk2u-adv-suse.so.3.0.5 \
libwx-gtk2u-core-suse.so.3.0.5 \
libwx-gtk2u-gl-suse.so.3.0.5 \
libwx-gtk2u-html-suse.so.3.0.5 \
noto-sans-fonts"

inherit rpm
