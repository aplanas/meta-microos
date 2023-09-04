SUMMARY = "Development files for the dbm key/data database library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.23"

RPM_NAME = "gdbm-devel-1.23-2.1.aarch64.rpm"
RPM_HASH = "0226c8ef8ef817124132e1164933a84f3a4383c5bd1ab6caebb16dcbd557cc6f7dff9c48f8faa32c29e658e10d2cbb142ba2eec8019a4d82c763c9d2a2306f21"

RPROVIDES:${PN} += "gdbm-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat4 \
libgdbm.so.6 \
libgdbm6 \
libreadline.so.8"

inherit rpm
