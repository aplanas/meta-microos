SUMMARY = "LibreOffice Icon Themes"
DESCRIPTION = "This package provides all of the LibreOffice icon themes."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-icon-themes-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "c5fa2b9265e0e26abfa6492f5617a15014a278b9a272ab92af179f6a6c84a408f9d16a76a46e00dae6c6510451541d70f6c45a8a08ef0b8698a379120d79f73b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-icon-theme-breeze \
libreoffice-icon-theme-galaxy \
libreoffice-icon-theme-hicontrast \
libreoffice-icon-theme-sifr \
libreoffice-icon-theme-tango \
libreoffice-icon-themes"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice-share-linker"

inherit rpm
