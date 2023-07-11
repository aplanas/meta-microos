SUMMARY = "Translations for package deepin-launcher"
DESCRIPTION = "Provides translations for the 'deepin-launcher' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.5.31"

RPM_NAME = "deepin-launcher-lang-5.5.31-2.4.noarch.rpm"
RPM_HASH = "422ea7c1b9dee3b6be90d0b3c127483a00a65f1a08c9c0e682f7a6043cf2ccb10d94f64c6a524b5bb81968cca865378acbec90937d442d08aed66a7df49fc574"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-launcher-lang \
deepin-launcher-lang-all"

RDEPENDS:${PN} += "deepin-launcher"

inherit rpm
