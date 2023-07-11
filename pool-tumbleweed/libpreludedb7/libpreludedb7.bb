SUMMARY = "Prelude Libraries"
DESCRIPTION = "The PreludeDB Library provides an abstraction layer upon the type and the \
format of the database used to store IDMEF alerts. It allows developers \
to use the Prelude IDMEF database easily and efficiently without \
worrying about SQL, and to access the database independently of the \
type/format of the database."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "libpreludedb7-5.2.0-2.12.aarch64.rpm"
RPM_HASH = "c3e3b33e053cc3c951394d1e237b73241926f824792ac180f6348660d9917f196055c6b92cfb4e8795f890652292c059a4a9b8750fc17ee738b94d1c39863141"

RPROVIDES:${PN} += "libpreludedb.so.7 \
libpreludedb7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libprelude.so.28"

inherit rpm
