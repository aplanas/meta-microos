SUMMARY = "Slovenian localization files for LibreOffice"
DESCRIPTION = "Provides Slovenian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-sl-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "70ce20705820dc0ca5d7c54c04e416fc2ad13df2153e10148790f72064e4c011cc617e61c994f9331ebfde09d0603940ebd106e899fb6cbedd078785f5f6db79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sl \
libreoffice-l10n-sl \
locale-libreoffice-sl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sl-SI"

inherit rpm
