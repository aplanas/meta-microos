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

RPM_NAME = "xcoral-3.50.2-1.10.aarch64.rpm"
RPM_HASH = "6b7435e0fc52955ddca507f463daa56ebe2bbcd37fbf87e478c91ac1a3809d60b4e2399847970cb2ac535ebca706df2f5cb48dd8e56dbe0131696a9baa4ac1f8"

RPROVIDES:${PN} += "config-xcoral \
xcoral \
xcoral21"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libc.so.6"

inherit rpm
