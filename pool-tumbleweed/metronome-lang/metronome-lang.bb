SUMMARY = "Translations for package metronome"
DESCRIPTION = "Provides translations for the 'metronome' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "metronome-lang-1.0.0-1.19.noarch.rpm"
RPM_HASH = "212c44bdf96cd211df094a67632dca06b74aef416bc61d528c4a81a817156499680dd7aaa45139090b6d307e226b51e3fb6a883c4bdec0c0bad575e02a578e7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-metronome-de \
locale-metronome-fr \
locale-metronome-lt \
locale-metronome-nl \
metronome-lang \
metronome-lang-all"

RDEPENDS:${PN} += "metronome"

inherit rpm
