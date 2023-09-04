SUMMARY = "YaST2 - Arabic Translations"
DESCRIPTION = "YaST2 - Translations for Arabic."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-ar-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "a6135eb0a050d4e65cb293b274594ebd42fa6fc9ae124bdfe5bd7b49343d571eeaa4ee1d0138cfb8b766793a4bf5ae94bde62502ee166984c15bf860463a9f81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ar \
yast2-trans-ar"

RDEPENDS:${PN} += ""

inherit rpm
