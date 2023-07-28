SUMMARY = "Sanskrit localization files for LibreOffice"
DESCRIPTION = "Provides Sanskrit translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-sa_IN-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "59b9ba0794561215356b473143457264d0f082f01ecd41f0e372447b9a5871a893cd267ad997b4d1611047811ef99d5aba30aee63f39605974bc0c64c8f45256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sa-IN \
libreoffice-l10n-sa-IN \
locale-libreoffice-sa-IN"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
