SUMMARY = "Development files for the dbm key/data database library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.23"

RPM_NAME = "gdbm-devel-1.23-1.14.aarch64.rpm"
RPM_HASH = "fececc7b1b1db8c3ad54721e6347e36e68805c5e5f743bfbfd19ab27f9b2ddab8a04eef1a29d0ca2ec181633c605fb3e0d1391e09905a3cd9ac02b4bb71ecab9"

RPROVIDES:${PN} += "gdbm-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat4 \
libgdbm.so.6 \
libgdbm6 \
libreadline.so.8"

inherit rpm
