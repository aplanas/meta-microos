SUMMARY = "Translations for package adriconf"
DESCRIPTION = "Provides translations for the 'adriconf' package."
LICENSE = "GPL-3.0-only"

PV = "2.6.0"

RPM_NAME = "adriconf-lang-2.6.0-2.1.noarch.rpm"
RPM_HASH = "9816437786e62d7b2ab8d9c541d1caf9137b148072e802b7b4c72b981ad021b83d969cf5b9a833c8bf0ab8da92e98dbab0d13c58d32ccb1149c8e9c2a48fd404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adriconf-lang adriconf-lang-all locale(adriconf:en) locale(adriconf:hr) locale(adriconf:lv) locale(adriconf:pl) locale(adriconf:pt_BR) locale(adriconf:zh_CN)"
RDEPENDS:${PN} += "adriconf"

inherit rpm
