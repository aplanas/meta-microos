SUMMARY = "Implementation of a suggestion lister"
DESCRIPTION = "This package contains a library that suggests commands in a 'did you \
mean' fashion."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libsl0-7.8.0-3.2.aarch64.rpm"
RPM_HASH = "cd72c3f73c102b11357731c29ae7fec968e20721965b932434edee13a72531963c016079522b0421c85bc484a3135b4510e1de5532dad8d807ad91b181cc1256"

RPROVIDES:${PN} += "libsl.so.0 \
libsl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libheimedit.so.0"

inherit rpm
