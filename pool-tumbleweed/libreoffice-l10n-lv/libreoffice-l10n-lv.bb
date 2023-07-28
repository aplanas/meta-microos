SUMMARY = "Latvian localization files for LibreOffice"
DESCRIPTION = "Provides Latvian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-lv-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "2f07e1f9dc28ffeebc25d722b64d0429a8cd528dc844ca0292150b98e9494350f9551acb2ae49a55ca35f25cfc58f9626dc4d3836331072c632b101b11826aa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lv \
libreoffice-l10n-lv \
locale-libreoffice-lv"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-lv-LV"

inherit rpm
