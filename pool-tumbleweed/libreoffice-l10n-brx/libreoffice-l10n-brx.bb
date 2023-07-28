SUMMARY = "Bodo localization files for LibreOffice"
DESCRIPTION = "Provides Bodo translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-brx-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "438920140e0367892e8c7b8a246de0e8f2fae81b66c550dd53ddc650fe67a84ca43798bba57de8553c2ca55374cf42bfeda3fe06394860bf1c636bcfde728850"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-brx \
libreoffice-l10n-brx \
locale-libreoffice-brx"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
