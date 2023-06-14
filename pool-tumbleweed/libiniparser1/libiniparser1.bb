SUMMARY = "Library to parse ini files"
DESCRIPTION = "Libiniparser offers parsing of ini files from the C level. \
 \
This package includes the libiniparser1 library."
LICENSE = "MIT"

PV = "4.1"

RPM_NAME = "libiniparser1-4.1-2.2.aarch64.rpm"
RPM_HASH = "507e7307ada56054e3cb1cb6627bc16d6b8e21d9bd0643bf31112cbf0e488eb9573d640e6a7d1cb7d62be99583ca56b3c474d0836314b85910791217be4fc038"

RPROVIDES:${PN} += "libiniparser.so.1 \
libiniparser1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
