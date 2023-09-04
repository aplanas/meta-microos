SUMMARY = "YaST2 - Danish Translations"
DESCRIPTION = "YaST2 - Translations for Danish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-da-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "6a579333ce37c4e7adc564e8657cf3f17aa90c35971d864c4c2bebad4f1ca16edfa674692f6db8d5bf33eaecf8f2a3e32d9c64f159e9f3b04b320cbff40e8a8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-da \
yast2-trans-da"

RDEPENDS:${PN} += ""

inherit rpm
