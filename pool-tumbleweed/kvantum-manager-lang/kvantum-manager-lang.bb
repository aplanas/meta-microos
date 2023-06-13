SUMMARY = "Translations for Kvantum manager"
DESCRIPTION = " \
This package provides translations for Kvantum manager."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "kvantum-manager-lang-1.0.10-1.1.noarch.rpm"
RPM_HASH = "2b3794a713f62054946b1be076992d2059236dfd52214624c929ed547ffd963fd8db5b0eba1d65358f8dd495912330e443776db109429dbb609d27b57ae5255b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kvantum-manager-lang"

RDEPENDS:${PN} += "kvantum-manager"

inherit rpm
