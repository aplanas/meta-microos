SUMMARY = "Translations for package amsynth"
DESCRIPTION = "Provides translations for the 'amsynth' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.13.2"

RPM_NAME = "amsynth-lang-1.13.2-1.6.noarch.rpm"
RPM_HASH = "b8d3c184a20532da839fa2e1631a8cc2845732ee821eea7ba454cc4531010f74dc0e87f709801e668a234368a796329fc7d700f22fd09d5fb5f06605d6460e47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "amsynth-lang \
amsynth-lang-all \
locale-amsynth-de \
locale-amsynth-fr"

RDEPENDS:${PN} += "amsynth"

inherit rpm
