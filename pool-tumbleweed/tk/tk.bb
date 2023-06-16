SUMMARY = "Graphical User Interface Toolkit for Tcl"
DESCRIPTION = "Tk is a graphical user interface toolkit that takes developing desktop \
applications to a higher level than conventional approaches. Tk is the \
standard GUI not only for Tcl, but for many other dynamic languages, \
and can produce rich, native applications that run unchanged across \
Windows, Mac OS X, Linux and more. \
 \
 \
 \
Authors: \
-------- \
    The Tcl Core Team <tcl-core@lists.sourceforge.net>"
LICENSE = "TCL"

PV = "8.6.13"

RPM_NAME = "tk-8.6.13-1.3.aarch64.rpm"
RPM_HASH = "a77d3aa79c06293742099e7acb7288f152f5e03fddce636b6061351828c2e3ced4b9bcc1977a744a5ac1f369000c5ec0d4cd366abd9972c36d29cc797e88701b"

RPROVIDES:${PN} += "libtk8.6.so \
tk \
tkcon \
wish \
wish8.6"

RDEPENDS:${PN} += "/usr/bin/rm \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libXss.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libtcl8.6.so \
tcl \
xhost"

inherit rpm
