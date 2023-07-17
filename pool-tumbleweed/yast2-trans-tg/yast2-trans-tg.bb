SUMMARY = "YaST2 - Tajik Translations"
DESCRIPTION = "YaST2 - Tajik translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-tg-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "f624244d38d36d6e9afce0c9966b4603a5ab14a62a52321e61049db00dd12297e69fab94ad1f556114cc489ae0839c0d28530ff1b8916e11d8e2698b7d4d8312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-tg \
yast2-trans-tg"

RDEPENDS:${PN} += ""

inherit rpm
