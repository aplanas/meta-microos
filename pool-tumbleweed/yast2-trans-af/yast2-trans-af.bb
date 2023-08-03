SUMMARY = "YaST2 - Afrikaans Translations"
DESCRIPTION = "YaST2 - Translations for Afrikaans."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-af-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "ee09a8d21991a8ad7d5b35014adb68f1cd4d2b5e23aa7f03788f7feced576d7546621f753be333ff8082efd2d94a8f4f812b3a42e99f46c3f17f3c1d07e5aa92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-af \
yast2-trans-af"

RDEPENDS:${PN} += ""

inherit rpm
