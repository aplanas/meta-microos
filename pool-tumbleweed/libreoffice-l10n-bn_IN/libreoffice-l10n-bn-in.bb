SUMMARY = "Bengali_India localization files for LibreOffice"
DESCRIPTION = "Provides Bengali_India translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-bn_IN-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "dae13ded90db910846c0cb19f0a985c68d0b7a846bb0593032ffcaba313ba490912e94f54e15e6a8288cc3c7dcc0fe99aabd4b420c1c8d79bfe8ec43ac822ba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bn-IN \
libreoffice-l10n-bn-IN \
locale-libreoffice-bn-IN"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-bn-IN"

inherit rpm
