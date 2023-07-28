SUMMARY = "Kurdish localization files for LibreOffice"
DESCRIPTION = "Provides Kurdish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-kmr_Latn-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "a89f99b6f98933dd46365a0b9a59e3830fb1ceebc1d1bf077dba0cd6b2eac25a8f2f67b4c4caf6b8ff40f4f3957ce567ef5b1187a7df653e72a4c33105867717"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kmr-Latn \
libreoffice-l10n-kmr-Latn \
locale-libreoffice-kmr-Latn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-kmr-Latn"

inherit rpm
