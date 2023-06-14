SUMMARY = "XDG Base Directory Specification Library"
DESCRIPTION = "The XDG Base Directory Specification defines where should user files be looked \
for by defining one or more base directories relative in with they should be \
located. \
 \
This library implements functions to list the directories according to the \
specification and provides a few higher-level functions."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "libxdg-basedir1-1.2.3-1.6.aarch64.rpm"
RPM_HASH = "2c07690af13b4694bc0bc64830980d107772740c3317c809d71c159dfa6bd7acb5be11306ee6ac1d61081fb0a3620131ef305d277824eadbb792cb9903df55c9"

RPROVIDES:${PN} += "libxdg-basedir.so.1 \
libxdg-basedir1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
