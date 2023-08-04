SUMMARY = "Data needed by libKSysGuardSystemStats"
DESCRIPTION = "Contains the unversioned D-Bus interface definition for KSystemStats plugins."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "ksysguardsystemstats-data-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "242927d20e4defcd25d01c7cde185e9eea22c90b58986bcb0bf1b361a1ca75f79abd7d2edbe910807e2137d840f56ffa2a5682f79feb1a3cfd00d9022bfce7fd"

RPROVIDES:${PN} += "ksysguardsystemstats-data"

RDEPENDS:${PN} += ""

inherit rpm
