SUMMARY = "Translations for package transmission-qt"
DESCRIPTION = "Provides translations for the 'transmission-qt' package."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.0.3"

RPM_NAME = "transmission-qt-lang-4.0.3-2.2.noarch.rpm"
RPM_HASH = "0e02fe30f4c492d762ee544990186339ce603144575eb67062bd169dc717709bd08ab0e214e0e2ed03f848983748397fcfc1bc469ed1f5e99feb5eefeb0439a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "transmission-qt-lang \
transmission-qt-lang-all"

RDEPENDS:${PN} += "transmission-qt"

inherit rpm
