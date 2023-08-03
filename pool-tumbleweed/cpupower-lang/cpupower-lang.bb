SUMMARY = "Translations for package cpupower"
DESCRIPTION = "Provides translations for the 'cpupower' package."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "cpupower-lang-6.4.6-4.19.noarch.rpm"
RPM_HASH = "66cd79e544415162e76db5946aebfc7c3f1547f901d0c84d96f1f5a0c728152b2a41efb8f6b3256f73e28fcaf10126e406244c6a107f312f389225f0ee6c8887"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpupower-lang \
cpupower-lang-all \
locale-cpupower-cs \
locale-cpupower-de \
locale-cpupower-fr \
locale-cpupower-it \
locale-cpupower-pt"

RDEPENDS:${PN} += "cpupower"

inherit rpm
