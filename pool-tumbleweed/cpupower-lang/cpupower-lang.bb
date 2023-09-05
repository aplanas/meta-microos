SUMMARY = "Translations for package cpupower"
DESCRIPTION = "Provides translations for the 'cpupower' package."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "cpupower-lang-6.4.12-4.23.noarch.rpm"
RPM_HASH = "17fa3a558d07e2f1bbb239d92ab56c81157cba6fd7b476bb56cb859ac72de5a3472106cbcbfe54a685609fe63f48d62591c43b28fe2d3cbe80933627cf385581"
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
