SUMMARY = "Data needed by libKSysGuardSystemStats"
DESCRIPTION = "Contains the unversioned D-Bus interface definition for KSystemStats plugins."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "ksysguardsystemstats-data-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "79a780eae480daad0c4d97fd329c6ee63ce283ffdf0109a7b23939763d1eb8d2bd1ba144001c4c22ba448c30db6aa476a05f91efedc49275aff969c15c6c4097"

RPROVIDES:${PN} += "ksysguardsystemstats-data"

RDEPENDS:${PN} += ""

inherit rpm
