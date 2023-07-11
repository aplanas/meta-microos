SUMMARY = "Development files for libpreludedb"
DESCRIPTION = "The PreludeDB Library provides an abstraction layer upon the type \
and the format of the database used to store IDMEF alerts. It \
allows developers to use the Prelude IDMEF database easily and \
efficiently without worrying about SQL, and to access the \
database independently of the type/format of the database."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "libpreludedb-devel-bindings-5.2.0-2.12.aarch64.rpm"
RPM_HASH = "8e901ce627b7cdf5f25701ec6f2fa156faf7265793e2a1a8f3e3e1f1aa8a34112a54e456813d618044fadb0b1b8efc0d02dce4340a21586e90dc1034bd39d966"

RPROVIDES:${PN} += "libpreludedb-devel-bindings"

RDEPENDS:${PN} += "libpreludedb-devel \
python3-devel \
swig"

inherit rpm
