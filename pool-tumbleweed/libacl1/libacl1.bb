SUMMARY = "A dynamic library for accessing POSIX Access Control Lists"
DESCRIPTION = "This package contains the libacl.so dynamic library which contains the \
POSIX 1003.1e draft standard 17 functions for manipulating access \
control lists."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.3.1"

RPM_NAME = "libacl1-2.3.1-2.13.aarch64.rpm"
RPM_HASH = "614c424af725514d32f6e2cc7c4f3721b10d535b8371224dfa93538c493e085f63d303da97899f0b0d2c262f7ff49bf9ddc715923f7f8972cd6c7ad5b8a40da1"

RPROVIDES:${PN} += "libacl \
libacl.so.1 \
libacl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
