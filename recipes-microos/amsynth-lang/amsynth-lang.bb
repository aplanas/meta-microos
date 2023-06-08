SUMMARY = "Translations for package amsynth"
DESCRIPTION = "Provides translations for the 'amsynth' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.13.2"

RPM_NAME = "amsynth-lang-1.13.2-1.4.noarch.rpm"
RPM_HASH = "e299c89f149885d5084942c21773fc543a89d7241e6e3fe40b78b363b1f24c7c9cbe8d665721e9aca7af1d31e521f50d4178b8465c097a62c4087afba36fb134"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "amsynth-lang amsynth-lang-all locale(amsynth:de) locale(amsynth:fr)"
RDEPENDS:${PN} += "amsynth"

inherit rpm
