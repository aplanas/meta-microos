SUMMARY = "Upper_Sorbian localization files for LibreOffice"
DESCRIPTION = "Provides Upper_Sorbian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-hsb-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "aa2922e45de9c0c0a8a8a9db2d7e04cce4771775d504a74187a3800a1e4f50230a7a70d952931df46533c49662773089f7320882afbc71b5359ae2e838e6da2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hsb \
libreoffice-l10n-hsb \
locale-libreoffice-hsb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
