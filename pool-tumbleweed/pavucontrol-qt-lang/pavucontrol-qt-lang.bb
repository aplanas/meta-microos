SUMMARY = "Translations for package pavucontrol-qt"
DESCRIPTION = "Provides translations for the 'pavucontrol-qt' package."
LICENSE = "GPL-2.0-only"

PV = "1.3.0"

RPM_NAME = "pavucontrol-qt-lang-1.3.0-1.1.noarch.rpm"
RPM_HASH = "622bbdbc6d84d85d14e203c200aeae89cfbb073a021ed2f9a9c5b69fcf6af0757fb7c66c1ba57fce9805a8680ca6d30ef3cf244d4ef798e338cc95e5b9c9a9e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pavucontrol-qt-lang \
pavucontrol-qt-lang-all"

RDEPENDS:${PN} += "pavucontrol-qt"

inherit rpm
