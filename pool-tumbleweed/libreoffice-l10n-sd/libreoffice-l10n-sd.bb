SUMMARY = "Sindhi localization files for LibreOffice"
DESCRIPTION = "Provides Sindhi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-sd-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "782179da07d1026d4dd64b58c2bfdce4be90525eff0dd71554fe6f5d9a65e5247c9055f32fb9cd13034751774d1c356fd033b2a4df2574a9b9e832ed635ea150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sd \
libreoffice-l10n-sd \
locale-libreoffice-sd"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
