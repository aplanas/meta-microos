SUMMARY = "Translations for package deepin-control-center"
DESCRIPTION = "Provides translations for the 'deepin-control-center' package."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.143"

RPM_NAME = "deepin-control-center-lang-5.5.143-1.7.noarch.rpm"
RPM_HASH = "7e6500be0aa278867ce4b623e13a812d461963e3fb8a64296e5168a092a72405b2670b0d00c8341cf8bd89a019a2e8e46956cdc564a4273620acb494db7439e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-control-center-lang \
deepin-control-center-lang-all"

RDEPENDS:${PN} += "deepin-control-center"

inherit rpm
