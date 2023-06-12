SUMMARY = "Translations for package cpupower"
DESCRIPTION = "Provides translations for the 'cpupower' package."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "cpupower-lang-6.3.4-4.12.noarch.rpm"
RPM_HASH = "3f3fa6073fa69e14aa6c48c20661ec0e1a7b4cdcc59800c0abccaa13528e0d07f36792ff47518bfc4ece30013ae01971e6579cada755f43b7c5341c9234bb65a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpupower-lang \
cpupower-lang-all \
locale(cpupower:cs) \
locale(cpupower:de) \
locale(cpupower:fr) \
locale(cpupower:it) \
locale(cpupower:pt)"
RDEPENDS:${PN} += "cpupower"

inherit rpm
