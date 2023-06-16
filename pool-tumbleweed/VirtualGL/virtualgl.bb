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

RPROVIDES:${PN} += "VirtualGL \
libdlfaker.so \
libgefaker.so \
libvglfaker-nodl.so \
libvglfaker-opencl.so \
libvglfaker.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libGLU.so.1 \
libX11.so.6 \
libXext.so.6 \
libXtst.so.6 \
libXv.so.1 \
libc.so.6 \
libfltk.so.1.3 \
libm.so.6 \
libturbojpeg.so.0"

inherit rpm
