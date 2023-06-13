SUMMARY = "Translations for package pidgin-plugin-birthday-reminder"
DESCRIPTION = "Provides translations for the 'pidgin-plugin-birthday-reminder' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.13"

RPM_NAME = "pidgin-plugin-birthday-reminder-lang-1.13-1.6.noarch.rpm"
RPM_HASH = "c7ffbeae15fd2ef82c83b8720f5a6c2439a57bc26c323d0b5285fa365d249f7074f6b41b73594cdb375ee758ab1abca897ae239c97df65efe0bfb9299daf67c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(pidgin-plugin-birthday-reminder:cs) \
locale(pidgin-plugin-birthday-reminder:de) \
locale(pidgin-plugin-birthday-reminder:el) \
locale(pidgin-plugin-birthday-reminder:es) \
locale(pidgin-plugin-birthday-reminder:fr) \
locale(pidgin-plugin-birthday-reminder:gl) \
locale(pidgin-plugin-birthday-reminder:he) \
locale(pidgin-plugin-birthday-reminder:it) \
locale(pidgin-plugin-birthday-reminder:lt) \
locale(pidgin-plugin-birthday-reminder:nl) \
locale(pidgin-plugin-birthday-reminder:pl) \
locale(pidgin-plugin-birthday-reminder:pt) \
locale(pidgin-plugin-birthday-reminder:pt_BR) \
locale(pidgin-plugin-birthday-reminder:ru) \
locale(pidgin-plugin-birthday-reminder:sk) \
locale(pidgin-plugin-birthday-reminder:ta) \
locale(pidgin-plugin-birthday-reminder:tr) \
pidgin-plugin-birthday-reminder-lang \
pidgin-plugin-birthday-reminder-lang-all"

RDEPENDS:${PN} += "pidgin-plugin-birthday-reminder"

inherit rpm
