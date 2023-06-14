SUMMARY = "Geany documentation"
DESCRIPTION = "Geany's developers documentation"
LICENSE = "GPL-2.0-or-later"

PV = "1.38"

RPM_NAME = "geany-doc-1.38-3.7.aarch64.rpm"
RPM_HASH = "4ba5c565a90c015e2dc0d19c446f5d86c0b93532ff1e11ef17477a750d293b701c05aa5eadae85a718b6a7e7c2dd38f60d45df3123caeffe270159e09a3ff2ed"

RPROVIDES:${PN} += "geany-doc"

RDEPENDS:${PN} += "geany"

inherit rpm
