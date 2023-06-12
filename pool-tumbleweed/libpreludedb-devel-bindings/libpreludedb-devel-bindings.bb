SUMMARY = "Development files for libpreludedb"
DESCRIPTION = "The PreludeDB Library provides an abstraction layer upon the type \
and the format of the database used to store IDMEF alerts. It \
allows developers to use the Prelude IDMEF database easily and \
efficiently without worrying about SQL, and to access the \
database independently of the type/format of the database."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "libpreludedb-devel-bindings-5.2.0-2.10.aarch64.rpm"
RPM_HASH = "7ff84179dba6b74fdd9b6cc922c0312b431abb5c6b3e0712d4a07db9c669c5633169c84414e12e75d522272237304d654ffd0261d87990497e5859b46fd92972"

RPROVIDES:${PN} += "libpreludedb-devel-bindings \
libpreludedb-devel-bindings(aarch-64)"
RDEPENDS:${PN} += "libpreludedb-devel \
python3-devel \
swig"

inherit rpm
