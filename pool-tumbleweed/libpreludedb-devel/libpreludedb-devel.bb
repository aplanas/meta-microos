SUMMARY = "Development files for libpreludedb"
DESCRIPTION = "The PreludeDB Library provides an abstraction layer upon the type \
and the format of the database used to store IDMEF alerts. It \
allows developers to use the Prelude IDMEF database easily and \
efficiently without worrying about SQL, and to access the \
database independently of the type/format of the database."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "libpreludedb-devel-5.2.0-2.10.aarch64.rpm"
RPM_HASH = "24ee8fe67615092cedfa4aeca7eac5a0b4ae395ad3eaa8c6cc66a4d7f3a262f6fc0267cb80c7970810f2d60696986fbf7e51ca2d641088c4a733bdc8ea3e509b"

RPROVIDES:${PN} += "libpreludedb-devel"

RDEPENDS:${PN} += "/bin/sh \
automake \
libprelude-devel \
libpreludedb7 \
libpreludedbcpp2 \
mysql-devel \
postgresql-devel \
sqlite-devel"

inherit rpm
