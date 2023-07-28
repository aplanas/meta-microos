SUMMARY = "Amharic localization files for LibreOffice"
DESCRIPTION = "Provides Amharic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-am-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "840894ac20a06740adb04c7e50d122e49456956f45937a5bc429266ee4bad027aeecc1aee24e952a5260c9132c519328d23f17461513ad6b8d8b688c0512ba96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-am \
libreoffice-l10n-am \
locale-libreoffice-am"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
