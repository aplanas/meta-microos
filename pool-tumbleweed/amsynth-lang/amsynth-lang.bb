SUMMARY = "Translations for package amsynth"
DESCRIPTION = "Provides translations for the 'amsynth' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.13.2"

RPM_NAME = "amsynth-lang-1.13.2-1.5.noarch.rpm"
RPM_HASH = "726236203b8905ec7bcbdd7e0526a699bd4e2cca3a79d49e2e13b727ae322df4918b23ace28536ad64d62d35eeef6cf11c2b5a655a077325b464cc307f458487"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "amsynth-lang \
amsynth-lang-all \
locale-amsynth-de \
locale-amsynth-fr"

RDEPENDS:${PN} += "amsynth"

inherit rpm
