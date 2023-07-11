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

RPM_NAME = "VirtualGL-devel-3.0.2-1.4.aarch64.rpm"
RPM_HASH = "36a5f1eb808bd1853429a18949c68d37bce0d0fbe0902509d776610a09d44c2f23d4f610ba598c7ba6e023949a3d28c2536cc6e594a9f921b3f810b4a38c8bbd"

RPROVIDES:${PN} += "VirtualGL-devel"

RDEPENDS:${PN} += "VirtualGL"

inherit rpm
