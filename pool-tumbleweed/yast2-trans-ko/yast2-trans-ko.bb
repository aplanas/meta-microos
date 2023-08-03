SUMMARY = "YaST2 - Korean Translations"
DESCRIPTION = "YaST2 - Translations for Korean."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-ko-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "c2bc26cdd4f169a999ac5d0fde2dd4adf9f686e2df640a52cb1d4590a40fd09d1eaeba854e82ca5a890b146ffbe378d83dedba859dcbb06380ab8f9c23639a8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ko \
yast2-trans-ko"

RDEPENDS:${PN} += ""

inherit rpm
