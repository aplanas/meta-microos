SUMMARY = "The NetBSD version of mkdep(1) tool"
DESCRIPTION = "bmkdep constructs Makefile dependency list. It takes \
a set of flags for the C compiler and a list of C source \
files as arguments and constructs a set of include file dependencies \
which are written into the file '.depend'."
LICENSE = "BSD-2-Clause"

PV = "20140112"

RPM_NAME = "bmkdep-20140112-1.16.aarch64.rpm"
RPM_HASH = "5f552c8d34d6ccf1f0ef358620c2b0b6b108f2a025ebe3595167c3f49a1b3df77225c00ceaa3ad654eb4d5da0443ecae805b81c72cce3e3f31a711a74d6e8f16"

RPROVIDES:${PN} += "bmkdep"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
