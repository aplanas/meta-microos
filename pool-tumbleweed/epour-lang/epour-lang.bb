SUMMARY = "Translations for package epour"
DESCRIPTION = "Provides translations for the 'epour' package."
LICENSE = "GPL-3.0"

PV = "0.7.0"

RPM_NAME = "epour-lang-0.7.0-1.18.noarch.rpm"
RPM_HASH = "9e798102caa8c82cecd3aa59cc004b5aa5385c7d3398d8e10eecd3e956756f2027553bd978f35bc67b147a9c5f8344f4207b7fa369250fff9c82dffbd15e4681"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "epour-lang \
epour-lang-all \
locale-epour-ko"

RDEPENDS:${PN} += "epour"

inherit rpm
