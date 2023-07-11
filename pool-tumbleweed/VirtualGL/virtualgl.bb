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

RPM_NAME = "VirtualGL-3.0.2-1.4.aarch64.rpm"
RPM_HASH = "ec49753830e256d28d856eba7bc5e7ca307c298906bc7174330901891d7cfecd195408179169e10935cff191325d5b2354d7344340c8b2d6f86944c78c0340c6"

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
