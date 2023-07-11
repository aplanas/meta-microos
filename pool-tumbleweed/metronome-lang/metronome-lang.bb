SUMMARY = "Translations for package metronome"
DESCRIPTION = "Provides translations for the 'metronome' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "metronome-lang-1.0.0-1.20.noarch.rpm"
RPM_HASH = "1e252f42e3a431aa6321e9970ced2aeb2cf9682b54ae0348dd905143285bc8d1456780b1a839715409c4e2551fff8f92ef381bd19bd9996c695bfc1c8f5e9185"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-metronome-de \
locale-metronome-fr \
locale-metronome-lt \
locale-metronome-nl \
metronome-lang \
metronome-lang-all"

RDEPENDS:${PN} += "metronome"

inherit rpm
