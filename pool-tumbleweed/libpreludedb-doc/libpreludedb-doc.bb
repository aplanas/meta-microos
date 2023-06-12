SUMMARY = "Libprelude documentation"
DESCRIPTION = "Libprelude documentation files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "libpreludedb-doc-5.2.0-2.10.aarch64.rpm"
RPM_HASH = "c627f5b916bf99aaba09531e66a06fe16d5bea13ab8a2a8d77e8294e9625debed1a04126e0bf1ba9349431fb70bfbccb807a5cd60cbcfa90fd064b267a2a30d0"

RPROVIDES:${PN} += "libpreludedb-doc \
libpreludedb-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
