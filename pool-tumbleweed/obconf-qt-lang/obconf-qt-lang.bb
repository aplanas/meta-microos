SUMMARY = "Translations for package obconf-qt"
DESCRIPTION = "Provides translations for the 'obconf-qt' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.3"

RPM_NAME = "obconf-qt-lang-0.16.3-1.1.noarch.rpm"
RPM_HASH = "6e840ac9a0e5da26afc9c94aa31208402bde458536b83a23d91b07b104719638aa607049768a2275a650ee63e399dada5e09e72f61fe55f1581fa1d304ba2a8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obconf-qt-lang \
obconf-qt-lang-all"

RDEPENDS:${PN} += "obconf-qt"

inherit rpm
