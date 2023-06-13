SUMMARY = "Translations for package lxqt-globalkeys"
DESCRIPTION = "Provides translations for the 'lxqt-globalkeys' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-globalkeys-lang-1.3.0-1.1.noarch.rpm"
RPM_HASH = "1347e9b0e5431c10b0a3efd24fe2707d264a0f9173d0a3f71389031e3a2d5def1ce1bfdcb6697d0e2535d366bc471d75bda4a210c0b6a270fe50505130b622b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-globalkeys-lang \
lxqt-globalkeys-lang-all"

RDEPENDS:${PN} += "lxqt-globalkeys"

inherit rpm
