SUMMARY = "Swati localization files for LibreOffice"
DESCRIPTION = "Provides Swati translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-ss-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "111c51db6fa25c9dc4d695306a273195df30ae7badcab9605b3d411368a67b3787b303690215c115e5c303968b1e26367298869de7eb17844cf8d276476a1883"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ss \
libreoffice-l10n-ss \
locale(libreoffice:ss)"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
