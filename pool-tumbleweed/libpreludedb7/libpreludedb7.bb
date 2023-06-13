SUMMARY = "Prelude Libraries"
DESCRIPTION = "The PreludeDB Library provides an abstraction layer upon the type and the \
format of the database used to store IDMEF alerts. It allows developers \
to use the Prelude IDMEF database easily and efficiently without \
worrying about SQL, and to access the database independently of the \
type/format of the database."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "libpreludedb7-5.2.0-2.10.aarch64.rpm"
RPM_HASH = "cb0db01277018a8cfcdd8d20865dd0db38a2fa1650ea59b9a29d68b7cbe533517a8c36e5a635d018ce48da9775dd1caf61649191e3a5ba5e9bbe041c152828e4"

RPROVIDES:${PN} += "libpreludedb.so.7()(64bit) \
libpreludedb7 \
libpreludedb7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libprelude.so.28()(64bit)"

inherit rpm
