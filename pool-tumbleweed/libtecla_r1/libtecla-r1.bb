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

RPM_NAME = "libtecla_r1-1.6.3-3.16.aarch64.rpm"
RPM_HASH = "5f37811da2c8d0d0d7f66ad0309944959aec0caf1ce2e0eac8394dca53ce065b589b77e61a67728250b6ed147b5842098c5adc95e058f623082f957fe33c6286"

RPROVIDES:${PN} += "libtecla-r.so.1 \
libtecla-r1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
