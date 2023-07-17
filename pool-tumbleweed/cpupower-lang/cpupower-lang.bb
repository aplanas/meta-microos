SUMMARY = "Translations for package cpupower"
DESCRIPTION = "Provides translations for the 'cpupower' package."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "cpupower-lang-6.4.2-4.16.noarch.rpm"
RPM_HASH = "1820f6244fc46864c8024512d81062a7b7078d605fa037aa52ba1b90f42b510d129a6f1f3c1f966f46a4d3893ca7e4918d5f646ad7f79f4dca303db8ff725b3a"
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
