SUMMARY = "YaST2 - Nepali Translations"
DESCRIPTION = "YaST2 - Translations for Nepali."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-ne-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "85d984e2a6f3fed0c9f1121d66c8f3d4b0c4e8c09f1f639af79f2e033fd067ae46131f97dc705014cd95ef950b122780c447c3c14a953c7611e2349b00c85be5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ne \
yast2-trans-ne"

RDEPENDS:${PN} += ""

inherit rpm
