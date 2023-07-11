SUMMARY = "Libprelude documentation"
DESCRIPTION = "Libprelude documentation files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "libpreludedb-doc-5.2.0-2.12.aarch64.rpm"
RPM_HASH = "28b55b2381e2d763813403e98b8e0ed4866b08922e381e6967b95292c57a449a121bf78ca6086d351cb3dd605956c0d93b41d25ba9f79a51ea56594ecb7256e2"

RPROVIDES:${PN} += "libpreludedb-doc"

RDEPENDS:${PN} += ""

inherit rpm
