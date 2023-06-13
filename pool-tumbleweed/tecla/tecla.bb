SUMMARY = "Interactive command line editing library"
DESCRIPTION = "The tecla library provides programs with interactive command line \
editing facilities, similar to those of the tcsh shell. \
In addition to simple command-line editing, it supports recall of \
previously entered command lines, TAB completion of file names or \
other tokens, and in-line wild-card expansion of filenames. The \
internal functions which perform file-name completion and wild-card \
expansion are also available externally for optional use by programs."
LICENSE = "X11"

PV = "1.6.3"

RPM_NAME = "tecla-1.6.3-3.15.aarch64.rpm"
RPM_HASH = "6d377c9a5d79e708d055dd607febe2393f3d03bc2ca36a68a8f35eead7f53e14aa4000ea968b71fb3832d41d6e6e6c0b8306033f1a408e6163a52f44169969ab"

RPROVIDES:${PN} += "tecla \
tecla(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libtecla_r.so.1()(64bit)"

inherit rpm
