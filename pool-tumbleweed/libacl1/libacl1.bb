SUMMARY = "A dynamic library for accessing POSIX Access Control Lists"
DESCRIPTION = "This package contains the libacl.so dynamic library which contains the \
POSIX 1003.1e draft standard 17 functions for manipulating access \
control lists."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.3.1"

RPM_NAME = "libacl1-2.3.1-2.12.aarch64.rpm"
RPM_HASH = "b0659fc04b3d5df7a8681ad6db59f9e8cc735fcd189f966cd232eb461229fe2ad93337a36a30d6f2795c220986b60ea0bea39c182cdbec213949693b6d6961aa"

RPROVIDES:${PN} += "libacl \
libacl.so.1 \
libacl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
