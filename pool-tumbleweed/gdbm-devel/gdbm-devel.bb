SUMMARY = "Development files for the dbm key/data database library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.23"

RPM_NAME = "gdbm-devel-1.23-1.12.aarch64.rpm"
RPM_HASH = "5f5e019f0025fecb1ab1921c25c046bf8eee761caf8cff694b51761c1983ece84ba6e686ad317433df41a910e1c2d4e186804fa05a49f78e289564ca56627397"

RPROVIDES:${PN} += "gdbm-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat4 \
libgdbm.so.6 \
libgdbm6 \
libreadline.so.8"

inherit rpm
