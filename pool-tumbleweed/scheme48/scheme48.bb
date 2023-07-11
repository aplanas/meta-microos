SUMMARY = "An implementation of Scheme written by Richard Kelsey and Jonathan Rees"
DESCRIPTION = "Scheme 48 is an implementation of the Scheme programming language as described \
in the Revised5 Report on the Algorithmic Language Scheme. It is based on a \
compiler and interpreter for a virtual Scheme machine. Scheme 48 tries to be \
faithful to the Revised5 Scheme Report, providing neither more nor less in \
the initial user environment."
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "scheme48-1.9.2-2.20.aarch64.rpm"
RPM_HASH = "e2dbc848f20c45efc91f6e80c58345946a909c79862f7d8b70bf4352687a093a75dc4149b4294b84a5d51bc35e3b1933d96b095054cd4c64ea215f7132e70fb4"

RPROVIDES:${PN} += "scheme48"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
scheme48-vm"

inherit rpm
