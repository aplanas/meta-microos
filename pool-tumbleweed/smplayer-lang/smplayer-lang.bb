SUMMARY = "Translations for package smplayer"
DESCRIPTION = "Provides translations for the 'smplayer' package."
LICENSE = "GPL-2.0-or-later"

PV = "22.7.0"

RPM_NAME = "smplayer-lang-22.7.0-1.5.noarch.rpm"
RPM_HASH = "7e58042556db3a399454e5cf476307c8a471da24031d676f16b05b542af8ab131ed41d2bac831367e3ca31731170c6f5a84d0de5244240769ebef39366040b59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "smplayer-lang \
smplayer-lang-all"

RDEPENDS:${PN} += "smplayer"

inherit rpm
