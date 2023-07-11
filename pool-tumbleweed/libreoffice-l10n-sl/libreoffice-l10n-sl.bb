SUMMARY = "Slovenian localization files for LibreOffice"
DESCRIPTION = "Provides Slovenian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-sl-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "4a363252fb720826e31db222b7727aada59ba9cab91ecdbab74484253df55813e6b51e900bfe2dee6f4748ce994cbc5539d1e08b3a82bf83dc37ea8355ce5b48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sl \
libreoffice-l10n-sl \
locale-libreoffice-sl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sl-SI"

inherit rpm
