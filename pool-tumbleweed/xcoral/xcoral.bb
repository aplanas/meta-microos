SUMMARY = "X11 Editor with C/C++/Java Browser"
DESCRIPTION = "Xcoral provides support for working with C, C++, Java, Perl, Ada, and \
Fortran programs and for the creation of LaTeX and HTML documents. \
With the help of the built-in 'SMall Ansi C Interpreter' (SMAC), \
xcoral can be configured and extended in almost arbitrary ways. \
Examples can be found in the directory /usr/lib/xcoral. It has \
a built-in C/C++/Java browser \
 \
Further information about Xcoral and SMAC is available in the detailed \
online help system (also available Postscript format)."
LICENSE = "GPL-2.0-or-later"

PV = "3.50.2"

RPM_NAME = "xcoral-3.50.2-1.9.aarch64.rpm"
RPM_HASH = "61c9a108bc01645b0bc1ab15f560986ea247c6ec78bc355a83d3b6cd89b365a8f1d1822a703c517e171d276189a17a793de9f5702909bc20472afb51fc85c2c2"

RPROVIDES:${PN} += "config(xcoral) \
xcoral \
xcoral(aarch-64) \
xcoral21"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXft.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm