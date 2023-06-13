SUMMARY = "Translations for package pidgin-plugin-libnotify"
DESCRIPTION = "Provides translations for the 'pidgin-plugin-libnotify' package."
LICENSE = "GPL-3.0+"

PV = "0.14"

RPM_NAME = "pidgin-plugin-libnotify-lang-0.14-1.26.noarch.rpm"
RPM_HASH = "d1796e1f976a3fa626057071c4662eaa47d69d7def541b8f09498de66f52087485dadf6aad375d52b2bcbf3af656cc96f243d9c90b994b0e117a5fccb1284684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(pidgin-plugin-libnotify:bg) \
locale(pidgin-plugin-libnotify:de) \
locale(pidgin-plugin-libnotify:es) \
locale(pidgin-plugin-libnotify:fr) \
locale(pidgin-plugin-libnotify:gl) \
locale(pidgin-plugin-libnotify:hu) \
locale(pidgin-plugin-libnotify:it) \
locale(pidgin-plugin-libnotify:nl) \
locale(pidgin-plugin-libnotify:pl) \
locale(pidgin-plugin-libnotify:pt) \
locale(pidgin-plugin-libnotify:pt_BR) \
locale(pidgin-plugin-libnotify:ro) \
locale(pidgin-plugin-libnotify:ru) \
locale(pidgin-plugin-libnotify:sl) \
locale(pidgin-plugin-libnotify:sv) \
locale(pidgin-plugin-libnotify:zh_CN) \
pidgin-plugin-libnotify-lang \
pidgin-plugin-libnotify-lang-all"

RDEPENDS:${PN} += "pidgin-plugin-libnotify"

inherit rpm
