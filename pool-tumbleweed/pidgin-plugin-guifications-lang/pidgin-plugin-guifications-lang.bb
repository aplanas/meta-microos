SUMMARY = "Translations for package pidgin-plugin-guifications"
DESCRIPTION = "Provides translations for the 'pidgin-plugin-guifications' package."
LICENSE = "GPL-2.0+"

PV = "2.16"

RPM_NAME = "pidgin-plugin-guifications-lang-2.16-10.27.noarch.rpm"
RPM_HASH = "73e78c57dd30463b6c2b4d81d760569241a31b9bc20c68e9ec6f90c25d9407818e856233f1be779e625a525f163e448dfa98850762ca2cd5d4368d6386f819a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(pidgin-plugin-guifications:bn) \
locale(pidgin-plugin-guifications:cs) \
locale(pidgin-plugin-guifications:de) \
locale(pidgin-plugin-guifications:en_AU) \
locale(pidgin-plugin-guifications:en_GB) \
locale(pidgin-plugin-guifications:es) \
locale(pidgin-plugin-guifications:fr) \
locale(pidgin-plugin-guifications:gl) \
locale(pidgin-plugin-guifications:he) \
locale(pidgin-plugin-guifications:hu) \
locale(pidgin-plugin-guifications:it) \
locale(pidgin-plugin-guifications:ja) \
locale(pidgin-plugin-guifications:mk) \
locale(pidgin-plugin-guifications:nl) \
locale(pidgin-plugin-guifications:pt) \
locale(pidgin-plugin-guifications:pt_BR) \
locale(pidgin-plugin-guifications:ru) \
locale(pidgin-plugin-guifications:sk) \
locale(pidgin-plugin-guifications:sr) \
locale(pidgin-plugin-guifications:sv) \
locale(pidgin-plugin-guifications:uk) \
locale(pidgin-plugin-guifications:zh_CN) \
locale(pidgin-plugin-guifications:zh_TW) \
pidgin-plugin-guifications-lang \
pidgin-plugin-guifications-lang-all"
RDEPENDS:${PN} += "pidgin-plugin-guifications"

inherit rpm
