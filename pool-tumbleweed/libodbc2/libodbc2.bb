SUMMARY = "Open Database Connectivity API"
DESCRIPTION = "ODBC is an API that abstracts the access to different database \
management systems."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.3.12"

RPM_NAME = "libodbc2-2.3.12-1.1.aarch64.rpm"
RPM_HASH = "892f78dca7e896f8178a7b4bef6f07636d1da503b79dd40854cf97a14d91cecf545090f9ec451f87dc4ecc74d53f6e2b358d2bb8a65235c3eb3562a427242470"

RPROVIDES:${PN} += "libodbc.so.2 \
libodbc2 \
libodbccr.so.2 \
libodbcinst.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libltdl.so.7"

inherit rpm
