SUMMARY = "Translations for package cpupower"
DESCRIPTION = "Provides translations for the 'cpupower' package."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "cpupower-lang-6.3.1-4.10.noarch.rpm"
RPM_HASH = "8b3570acf83cb2d7ab0c8dedf0bc407deff24873140e27f45fdb31acb0a1a42b206099cb2109c0815e0b3a3efae812f974f795661a5e6a91dd9f726d99df41ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpupower-lang cpupower-lang-all locale(cpupower:cs) locale(cpupower:de) locale(cpupower:fr) locale(cpupower:it) locale(cpupower:pt)"
RDEPENDS:${PN} += "cpupower"

inherit rpm
