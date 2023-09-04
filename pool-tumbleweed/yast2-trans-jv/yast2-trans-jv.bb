SUMMARY = "YaST2 - Javanese Translations"
DESCRIPTION = "YaST2 - Translations for Javanese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-jv-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "de722a0eddbb8318cfaa3bbce3cce4627cbac07ae88882c107293e6bd53abb1fea9e0196194eee1431fe4068ef345e479e1dcc6c875c05c417f1413e58f2fa13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-jv \
yast2-trans-jv"

RDEPENDS:${PN} += ""

inherit rpm
