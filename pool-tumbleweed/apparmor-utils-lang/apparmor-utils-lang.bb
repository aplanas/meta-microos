SUMMARY = "Translations for package apparmor-utils"
DESCRIPTION = "Provides translations for the 'apparmor-utils' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.4"

RPM_NAME = "apparmor-utils-lang-3.1.4-1.1.noarch.rpm"
RPM_HASH = "aac455dd0c237eb22fafc9fd4ceb42fac02f47446de8f4713ec4b0a69c13be151e05a4a8e9ad9a10f4f834e0516537aabdc5684284095b5f74c5bf5b59167221"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-utils-lang \
apparmor-utils-lang-all \
locale(apparmor-utils:af) \
locale(apparmor-utils:bs) \
locale(apparmor-utils:de) \
locale(apparmor-utils:en_GB) \
locale(apparmor-utils:es) \
locale(apparmor-utils:fa) \
locale(apparmor-utils:fr) \
locale(apparmor-utils:hi) \
locale(apparmor-utils:id) \
locale(apparmor-utils:it) \
locale(apparmor-utils:ko) \
locale(apparmor-utils:pl) \
locale(apparmor-utils:pt) \
locale(apparmor-utils:pt_BR) \
locale(apparmor-utils:ru) \
locale(apparmor-utils:sv) \
locale(apparmor-utils:tr) \
locale(apparmor-utils:ug) \
locale(apparmor-utils:uk) \
locale(apparmor-utils:zh_CN)"

RDEPENDS:${PN} += "apparmor-utils"

inherit rpm
