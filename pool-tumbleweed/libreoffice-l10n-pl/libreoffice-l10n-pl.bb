SUMMARY = "Polish localization files for LibreOffice"
DESCRIPTION = "Provides Polish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-pl-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "c9955c3403c7deaa6f5baa23450e9e6c0e6740cc575ab66e67459655939e428cf62f857be37c7325f50363ee2402c8a431e684b857d09dbdfe68158c5ac111d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pl \
libreoffice-l10n-pl \
locale-libreoffice-pl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-pl-PL"

inherit rpm
