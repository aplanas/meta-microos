SUMMARY = "Translations for package amsynth"
DESCRIPTION = "Provides translations for the 'amsynth' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.13.2"

RPM_NAME = "amsynth-lang-1.13.2-1.7.noarch.rpm"
RPM_HASH = "a1454fe63d7a9f19538c07d63b09bbe5073a1dc1ecadebb951e451b8b45462a61c12b49f6f612d137b0a5b3a00be883625b7bec559e091b94733f07fc61cf7fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "amsynth-lang \
amsynth-lang-all \
locale-amsynth-de \
locale-amsynth-fr"

RDEPENDS:${PN} += "amsynth"

inherit rpm
