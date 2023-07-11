SUMMARY = "Translations for package smplayer"
DESCRIPTION = "Provides translations for the 'smplayer' package."
LICENSE = "GPL-2.0-or-later"

PV = "22.7.0"

RPM_NAME = "smplayer-lang-22.7.0-1.6.noarch.rpm"
RPM_HASH = "ba60e54681544d2b31c73965ae8c80db4fc01c1a2e5e3f8fa17dffe176e9f945db8d4226c9763cc4c2492f713dd1f3fc9fb86dae648ab7b92628c9b0b75eb22e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "smplayer-lang \
smplayer-lang-all"

RDEPENDS:${PN} += "smplayer"

inherit rpm
