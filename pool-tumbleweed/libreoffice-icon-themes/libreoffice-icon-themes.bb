SUMMARY = "LibreOffice Icon Themes"
DESCRIPTION = "This package provides all of the LibreOffice icon themes."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-icon-themes-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "b755ac4ce0cae75683b34151ea090e06a06b7ca6fd872f0f37f2930d6d056e8ea56f053c0772028b3b1d5d9a1232281250be72faced0ab4e3b6780bcf9bb898a"
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
