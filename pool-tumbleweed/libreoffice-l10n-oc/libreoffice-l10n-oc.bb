SUMMARY = "Occitan localization files for LibreOffice"
DESCRIPTION = "Provides Occitan translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-oc-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "1f8def6ceb961721c23c8f40311ebf2778cf23f4d767d4a1ea4fd73158e54eb8eff8f1ff36fdb3262d501d3e1985139b20d55df1842abf5a120e919ba4033fbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-oc \
libreoffice-l10n-oc \
locale-libreoffice-oc"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-oc-FR"

inherit rpm
