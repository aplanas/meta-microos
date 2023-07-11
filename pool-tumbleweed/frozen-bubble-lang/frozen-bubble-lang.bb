SUMMARY = "Translations for package frozen-bubble"
DESCRIPTION = "Provides translations for the 'frozen-bubble' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.212"

RPM_NAME = "frozen-bubble-lang-2.212-15.4.noarch.rpm"
RPM_HASH = "2286126fde071118872607cc533c41fb8cacd614eab6fbc937032c981fc3c8b7ae4868c97221398cb3aa5a06cda147932937099ff5b3c82e4731a6c712dbbf71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "frozen-bubble-lang \
frozen-bubble-lang-all"

RDEPENDS:${PN} += "frozen-bubble"

inherit rpm
