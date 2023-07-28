SUMMARY = "YaST2 - Norwegian Nynorsk"
DESCRIPTION = "YaST2 - Translations for Norwegian Nynorsk."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-nn-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "3584e6902357796a586e9127e1672ceab11df23ec02e086fbf59c8977e0971a6bedc17562a41d4febfd3d1ad1b2a6c18a73b866fc11b47d42b6f4e4a7d72013a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nn \
yast2-trans-nn"

RDEPENDS:${PN} += ""

inherit rpm
