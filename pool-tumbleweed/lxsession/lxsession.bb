SUMMARY = "LXDE Session Manager, required for running the desktop environment"
DESCRIPTION = "LXSession is the standard session manager used by LXDE. The LXSession manager \
is used to automatically start a set of applications and set up a working desktop \
environment. Moreover, the session manager is able to remember the applications in \
use when a user logs out and to restart them the next time the user logs in."
LICENSE = "GPL-2.0-only"

PV = "0.5.5"

RPM_NAME = "lxsession-0.5.5-2.13.aarch64.rpm"
RPM_HASH = "49f0623e26d66c76213712cfe474940e5675fc8c48c5a43170a5b1a6c9df87d676187601704f025ca08d9d8fe8ae9b60a4f21ff2c3eb30ec4a755ba235e8dd75"

RPROVIDES:${PN} += "lxpolkit \
lxsession \
lxsession-edit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0"

inherit rpm
