SUMMARY = "Georgian localization files for LibreOffice"
DESCRIPTION = "Provides Georgian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-ka-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "0e1d849c661744133a7c21f4107e63e91fab3ac536565f3548bb1c0b0493298843fa480843f5007941c05d73bab59c159e60f6e0e61c77d31cce0a6ce507f532"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ka \
libreoffice-l10n-ka \
locale-libreoffice-ka"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
