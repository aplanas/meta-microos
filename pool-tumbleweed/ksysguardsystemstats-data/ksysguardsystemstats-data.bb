SUMMARY = "Data needed by libKSysGuardSystemStats"
DESCRIPTION = "Contains the unversioned D-Bus interface definition for KSystemStats plugins."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "ksysguardsystemstats-data-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "27a0dac1c50faf95c50d912436207ef2cea04a1538a67c8654811facafffc45d413ad911932b89d705f9a2ef7ea81cbe9a11604d400d464074768efdc786b983"

RPROVIDES:${PN} += "ksysguardsystemstats-data"

RDEPENDS:${PN} += ""

inherit rpm
