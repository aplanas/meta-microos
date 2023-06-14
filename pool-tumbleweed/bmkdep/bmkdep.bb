SUMMARY = "The NetBSD version of mkdep(1) tool"
DESCRIPTION = "bmkdep constructs Makefile dependency list. It takes \
a set of flags for the C compiler and a list of C source \
files as arguments and constructs a set of include file dependencies \
which are written into the file '.depend'."
LICENSE = "BSD-2-Clause"

PV = "20140112"

RPM_NAME = "bmkdep-20140112-1.15.aarch64.rpm"
RPM_HASH = "b0bc76d3c3afe8b48df4de6f552d53864d9c5628ab4e5503e245780dc094094bf75c0c43e0e6a88d4537acc733dab39247b7194a06826221c99f205eba3f48b7"

RPROVIDES:${PN} += "bmkdep"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
