SUMMARY = "A toolkit for displaying OpenGL applications to thin clients"
DESCRIPTION = "VirtualGL is a library which allows most Linux OpenGL applications to be \
remotely displayed to a thin client without the need to alter the \
applications in any way.  VGL inserts itself into an application at run time \
and intercepts a handful of GLX calls, which it reroutes to the server's \
display (which presumably has a 3D accelerator attached.)  This causes all \
3D rendering to occur on the server's display.  As each frame is rendered \
by the server, VirtualGL reads back the pixels from the server's framebuffer \
and sends them to the client for re-compositing into the appropriate X \
Window.  VirtualGL can be used to give hardware-accelerated 3D capabilities to \
VNC or other remote display environments that lack GLX support.  In a LAN \
environment, it can also be used with its built-in motion-JPEG video delivery \
system to remotely display full-screen 3D applications at 20+ frames/second. \
 \
VirtualGL is based upon ideas presented in various academic papers on \
this topic, including 'A Generic Solution for Hardware-Accelerated Remote \
Visualization' (Stegmaier, Magallon, Ertl 2002) and 'A Framework for \
Interactive Hardware Accelerated Remote 3D-Visualization' (Engel, Sommer, \
Ertl 2000.)"
LICENSE = "LGPL-2.1-only & SUSE-wxWidgets-3.1"

PV = "3.0.2"

RPM_NAME = "VirtualGL-3.0.2-1.3.aarch64.rpm"
RPM_HASH = "4ac0d057825de917d786414fa74ab695e8c304cd2173c5e825715747a0e0bc81765a868d6e2d19b2c33621465f4062225947e5e3410ceb3462b6800c04afb25e"

RPROVIDES:${PN} += "VirtualGL VirtualGL(aarch-64) libdlfaker.so()(64bit) libgefaker.so()(64bit) libvglfaker-nodl.so()(64bit) libvglfaker-opencl.so()(64bit) libvglfaker.so()(64bit)"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libEGL.so.1()(64bit) libGL.so.1()(64bit) libGLU.so.1()(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXtst.so.6()(64bit) libXv.so.1()(64bit) libc.so.6(GLIBC_2.35)(64bit) libfltk.so.1.3()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libturbojpeg.so.0()(64bit) libturbojpeg.so.0(TURBOJPEG_1.0)(64bit) libturbojpeg.so.0(TURBOJPEG_1.2)(64bit)"

inherit rpm
