SUMMARY = "Documentation for mod_auth_mellon module"
DESCRIPTION = "This package contains a documentation for mod_auth_mellon module."
LICENSE = "GPL-2.0-or-later"

PV = "0.17.0"

RPM_NAME = "apache2-mod_auth_mellon-doc-0.17.0-2.9.aarch64.rpm"
RPM_HASH = "897e520fd296c006557c1d23f936002cb8592a10ca072ec15869831ddae45f41697ff733220a9f2453ffedefac78f3663447788f6cc4b21a726511f4eb3117f8"

RPROVIDES:${PN} += "apache2-mod_auth_mellon-doc apache2-mod_auth_mellon-doc(aarch-64)"
RDEPENDS:${PN} += "apache2-mod_auth_mellon"

inherit rpm
