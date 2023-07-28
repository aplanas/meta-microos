SUMMARY = "Tamil localization files for LibreOffice"
DESCRIPTION = "Provides Tamil translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ta-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "dc1025a1fb9853163259b22dc18420246f5393add62482451a49ae1f93d0e4b1b80c3f1eab7ab633a7c2237831fe235fa566caf04b1bc972a5598d8df4139d0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ta \
libreoffice-l10n-ta \
locale-libreoffice-ta"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
