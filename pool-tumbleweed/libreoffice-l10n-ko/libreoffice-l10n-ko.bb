SUMMARY = "Korean localization files for LibreOffice"
DESCRIPTION = "Provides Korean translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ko-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "d119deaf796155a20c088c0e9a30efe7b252048921601a969d6fdcbb3330f3f7bb92b86bcc20816ac43638a33cdc21865d9677d48da3fc28a66807b063d29a16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ko \
libreoffice-l10n-ko \
locale-libreoffice-ko"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
