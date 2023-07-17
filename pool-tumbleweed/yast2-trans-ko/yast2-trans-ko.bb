SUMMARY = "YaST2 - Korean Translations"
DESCRIPTION = "YaST2 - Translations for Korean."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-ko-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "9f4a4c091aa46e36865490f9dd80c8b1e914b2a7595baa99bf0b7aa357294694ffc44cb2433c52edc0d6de3213ae07432cd3bdc212d7fe43340563cf4fe8047a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ko \
yast2-trans-ko"

RDEPENDS:${PN} += ""

inherit rpm
