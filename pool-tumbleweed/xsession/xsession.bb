SUMMARY = "A session manager"
DESCRIPTION = "The xsession program is a session manager.  It is normally executed by \
your ~/.xinitrc (or ~/.xsession) script and controls your X Window \
session.  As soon as it is started, xsession launches a window manager \
and some applications of your choice.  At anytime during your session, \
you may switch to another window manager or execute some other \
applications from the xsession menus. \
 \
Examples may be found under /usr/share/doc/packages/xsession/examples. \
 \
 \
 \
Authors: \
-------- \
    Alain Nissen <nissen@montefiore.ulg.ac.be> \
    Raphael Quinet <quinet@stud.montefiore.ulg.ac.be>"
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "xsession-1.1-1247.27.aarch64.rpm"
RPM_HASH = "9fd1a652dc4870c7137795cae3225255cfc9c4d9be8dc5bd88a5e715d47f49d2b8a9a00d988f4a663a2de31b6038ce3d4f392ddc2e4a31568eafa309873336a1"

RPROVIDES:${PN} += "config-xsession \
xsession"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm
