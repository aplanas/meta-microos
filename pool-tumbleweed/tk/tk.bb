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

RPM_NAME = "tk-8.6.13-1.4.aarch64.rpm"
RPM_HASH = "40d993a9ab2bf529277c2504a3cd92df5c72e14f5700ddc05ef42db1ab1dc2a89eb989def59dc49d5afb0fe5e339a12877d9b4062e4a5bf3e630c9654ef8eba5"

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
