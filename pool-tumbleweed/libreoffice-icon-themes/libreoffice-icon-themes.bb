SUMMARY = "LibreOffice Icon Themes"
DESCRIPTION = "This package provides all of the LibreOffice icon themes."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-icon-themes-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "7d3a384741873a2c286e50f156ae23b974856f4cc215bf03fe27413b67644fa0e65ba14b362e00478e44feba778abe43b06c8738187b61cfb8fc1204ef452e9d"
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
