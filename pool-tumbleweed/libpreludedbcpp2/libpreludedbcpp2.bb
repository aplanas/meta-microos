SUMMARY = "Prelude Libraries"
DESCRIPTION = "The PreludeDB Library provides an abstraction layer upon the type and the \
format of the database used to store IDMEF alerts. It allows developers \
to use the Prelude IDMEF database easily and efficiently without \
worrying about SQL, and to access the database independently of the \
type/format of the database."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "libpreludedbcpp2-5.2.0-2.12.aarch64.rpm"
RPM_HASH = "8f83e404a06cd99fd1fa89459c3b1446b32debd23e0d4a6aaf6c83afa178387591785dd7e277a0a46780b4b2f2b99a1deed7a73005144f8218ddd0b9fecd093a"

RPROVIDES:${PN} += "libpreludedbcpp.so.2 \
libpreludedbcpp2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libprelude.so.28 \
libpreludecpp.so.12 \
libpreludedb.so.7 \
libstdc++.so.6"

inherit rpm
