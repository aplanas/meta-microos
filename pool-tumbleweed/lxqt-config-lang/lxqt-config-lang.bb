SUMMARY = "Translations for package lxqt-config"
DESCRIPTION = "Provides translations for the 'lxqt-config' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-config-lang-1.3.0-1.2.noarch.rpm"
RPM_HASH = "2f58c2a258087cf6eb83aed0ce4db2bf9693e07f71b4a82f5eba0c78bf0a828b830ffe09cd7dd8c53b33df94db1dab8f969b7fb6636708ed0ac60a7d90d7df2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-config-lang \
lxqt-config-lang-all"

RDEPENDS:${PN} += "lxqt-config"

inherit rpm
