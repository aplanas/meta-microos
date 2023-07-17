SUMMARY = "YaST2 - Norwegian Nynorsk"
DESCRIPTION = "YaST2 - Translations for Norwegian Nynorsk."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-nn-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "7566b94ad50d69cfa057dcd8f6324c2d9ccc8480a320071c4332ac4952bb6686dd080e2985c4862147470d2bfd3fd253bc8374fd2cc1d39391888f10002e15b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nn \
yast2-trans-nn"

RDEPENDS:${PN} += ""

inherit rpm
