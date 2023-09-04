SUMMARY = "LibreOffice Icon Themes"
DESCRIPTION = "This package provides all of the LibreOffice icon themes."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-icon-themes-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "cad20d40b6af3374510df62a456a47ebb21dc792e4ee7f7f73f904fa64739829613f03274fa01ca9a6b4f32b7342ef70f73b504d000529184f5678e943a46038"
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
