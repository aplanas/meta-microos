SUMMARY = "Java-based XML parser (documentation)"
DESCRIPTION = "Javadoc for aelfred."
LICENSE = "BSD-3-Clause"

PV = "7.0"

RPM_NAME = "aelfred-javadoc-7.0-8.6.noarch.rpm"
RPM_HASH = "83a4f00a5c0eb84dba96802ccb52def4f1fa3a3a151e2699fefa0f2cafe0629ac76ce36fc237d2d8cbdbc387e88e3df57271f253ae077e959417b88a50f01518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aelfred-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
