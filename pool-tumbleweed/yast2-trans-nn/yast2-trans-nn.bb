SUMMARY = "YaST2 - Norwegian Nynorsk"
DESCRIPTION = "YaST2 - Translations for Norwegian Nynorsk."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-nn-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "d1bd95e2ff76cd88ce90922a733cd5283889451c54cf46ae8f9ece16553439dc218eb603573c194cf7cc7d058bd7d8e3357411770e5a5a84b5307ad49a7d1af2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nn \
yast2-trans-nn"

RDEPENDS:${PN} += ""

inherit rpm
