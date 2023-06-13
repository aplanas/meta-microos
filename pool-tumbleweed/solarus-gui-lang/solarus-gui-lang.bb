SUMMARY = "Translations for package solarus-gui"
DESCRIPTION = "Provides translations for the 'solarus-gui' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.5"

RPM_NAME = "solarus-gui-lang-1.6.5-2.15.noarch.rpm"
RPM_HASH = "e78ca2a8628f1b0c111f4cd1157378572733139fdede367c307d0af1b2e9058ce251aa0bc842e7f6ca4ea7884cd40ed967f4c2e594c72817312685db81bc0e12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "solarus-gui-lang \
solarus-gui-lang-all"

RDEPENDS:${PN} += "solarus-gui"

inherit rpm
