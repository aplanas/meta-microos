SUMMARY = "YaST2 - Portuguese Translations"
DESCRIPTION = "YaST2 - Translations for Portuguese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-pt-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "2337d45e7c7d4d181e95e8398a43d4d47e6d48a878ca4c0c7858132f6414fdf96065c4c9622bb227925c2ff13df10144d7af2daba3007849f79835530e089461"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pt \
yast2-trans-pt"

RDEPENDS:${PN} += ""

inherit rpm
