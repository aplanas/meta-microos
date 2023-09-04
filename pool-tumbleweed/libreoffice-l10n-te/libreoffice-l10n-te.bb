SUMMARY = "Telugu localization files for LibreOffice"
DESCRIPTION = "Provides Telugu translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-te-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "209071bc322d667883680cb1f443f55287676dec619c86aca66e43ed7952d1b32abb3bc49ad73c45419557fc2a5287c4c9b678197cd306d85056579acd9ccaad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-te \
libreoffice-l10n-te \
locale-libreoffice-te"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-te-IN"

inherit rpm
