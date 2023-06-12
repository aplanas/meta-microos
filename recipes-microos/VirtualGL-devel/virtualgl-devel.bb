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

RPM_NAME = "VirtualGL-devel-3.0.2-1.3.aarch64.rpm"
RPM_HASH = "9eda29969f25a839eb4519aeaf9996fd38169397f880a761bf0186ac5313cfb65b3b5b9bc50e41c204affd8ab6349dfa94cfbbfcedc98626a09130c82a8eb20f"

RPROVIDES:${PN} += "VirtualGL-devel \
VirtualGL-devel(aarch-64)"
RDEPENDS:${PN} += "VirtualGL"

inherit rpm
