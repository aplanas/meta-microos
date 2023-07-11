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

RPM_NAME = "tecla-1.6.3-3.16.aarch64.rpm"
RPM_HASH = "8ae8bb59d38a8440d94b013cb59d71e69f79fb6d76711af0a1ed0593fd4015fb1da87bce7c84e1b4bdf31de29a41d867488662f3cd76d01e862eebd2de87261b"

RPROVIDES:${PN} += "tecla"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtecla-r.so.1"

inherit rpm
