SUMMARY = "Development files for libpreludedb"
DESCRIPTION = "The PreludeDB Library provides an abstraction layer upon the type \
and the format of the database used to store IDMEF alerts. It \
allows developers to use the Prelude IDMEF database easily and \
efficiently without worrying about SQL, and to access the \
database independently of the type/format of the database."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "libpreludedb-devel-5.2.0-2.12.aarch64.rpm"
RPM_HASH = "5c76399dc8485f6af7ab7b007b620ee8a20b2a390ffc65105117f456bf7596d240d1363874584b86186acbd55eac51f538e02cf2022c3745c066d63cc279afa1"

RPROVIDES:${PN} += "libpreludedb-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
automake \
libprelude-devel \
libpreludedb7 \
libpreludedbcpp2 \
mysql-devel \
postgresql-devel \
sqlite-devel"

inherit rpm
