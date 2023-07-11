SUMMARY = "Libraries, include files for Prelude Manager"
DESCRIPTION = "Header files and libraries for prelude-manager development."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "prelude-manager-devel-5.2.0-2.11.aarch64.rpm"
RPM_HASH = "38044bbe16c0635b0e0e7de1c621060a2c1605af6bfc65e04b80085c9f06aea88bc826d098f8adba655a61d01a86533dd522cc60744f321b58c44b2854718dbc"

RPROVIDES:${PN} += "prelude-manager-devel"

RDEPENDS:${PN} += "libpreludedb-devel \
prelude-manager"

inherit rpm
