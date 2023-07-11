SUMMARY = "Bulgarian localization files for LibreOffice"
DESCRIPTION = "Provides Bulgarian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-bg-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "9185bdac007f0a42f57e603ce54024670c98e9b82b8ea83f5dd96188e3d5e80d0bf4da463080b9f154a0640ad1760a6dd99470623f81ebdb085291e0a3ee37f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bg \
libreoffice-l10n-bg \
locale-libreoffice-bg"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-bg-BG"

inherit rpm
