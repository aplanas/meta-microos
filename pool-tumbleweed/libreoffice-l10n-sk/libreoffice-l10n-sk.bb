SUMMARY = "Slovak localization files for LibreOffice"
DESCRIPTION = "Provides Slovak translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-sk-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "0c62d24b3132dac2116358833d00707757768156e92ae33d98de6520e1553b0bc82d24d823d6d6841af87890f1d07f5f09516ee2e74dcad4f8e2432954bfed87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sk \
libreoffice-l10n-sk \
locale-libreoffice-sk"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sk-SK"

inherit rpm
