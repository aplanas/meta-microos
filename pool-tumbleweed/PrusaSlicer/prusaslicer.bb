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

RPROVIDES:${PN} += "PrusaSlicer \
PrusaSlicer(aarch-64) \
application() \
application(PrusaGcodeviewer.desktop) \
application(PrusaSlicer.desktop) \
mimehandler(application/prs.wavefront-obj) \
mimehandler(application/vnd.ms-3mfdocument) \
mimehandler(application/x-amf) \
mimehandler(model/stl) \
mimehandler(text/x.gcode)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libTKBRep.so.7.7()(64bit) \
libTKLCAF.so.7.7()(64bit) \
libTKMath.so.7.7()(64bit) \
libTKMesh.so.7.7()(64bit) \
libTKTopAlgo.so.7.7()(64bit) \
libTKXCAF.so.7.7()(64bit) \
libTKXDESTEP.so.7.7()(64bit) \
libTKernel.so.7.7()(64bit) \
libboost_chrono.so.1.82.0()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_iostreams.so.1.82.0()(64bit) \
libboost_locale.so.1.82.0()(64bit) \
libboost_log.so.1.82.0()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libgmp.so.10()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libmpfr.so.6()(64bit) \
libnlopt.so.0()(64bit) \
libopenvdb.so.9.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtbb.so.12()(64bit) \
libwx_baseu-suse.so.3.0.5()(64bit) \
libwx_baseu-suse.so.3.0.5(WXU_3.0)(64bit) \
libwx_gtk2u_adv-suse.so.3.0.5()(64bit) \
libwx_gtk2u_adv-suse.so.3.0.5(WXU_3.0)(64bit) \
libwx_gtk2u_adv-suse.so.3.0.5(WXU_3.0.3)(64bit) \
libwx_gtk2u_core-suse.so.3.0.5()(64bit) \
libwx_gtk2u_core-suse.so.3.0.5(WXU_3.0)(64bit) \
libwx_gtk2u_gl-suse.so.3.0.5()(64bit) \
libwx_gtk2u_gl-suse.so.3.0.5(WXU_3.0)(64bit) \
libwx_gtk2u_html-suse.so.3.0.5()(64bit) \
libwx_gtk2u_html-suse.so.3.0.5(WXU_3.0)(64bit) \
noto-sans-fonts"

inherit rpm
