SUMMARY = "Portuguese localization files for LibreOffice"
DESCRIPTION = "Provides Portuguese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-pt_PT-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "28a54220b12e372afc1c3caab029feff9d4484435907e5db1a410caeebaf400f681f00b9db6bba786766683c8a5743e03e69390cdd727f4b1c306e3143cd49f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pt \
libreoffice-help-pt-PT \
libreoffice-l10n-pt \
libreoffice-l10n-pt-PT \
locale-libreoffice-pt-PT"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-pt-PT"

inherit rpm
