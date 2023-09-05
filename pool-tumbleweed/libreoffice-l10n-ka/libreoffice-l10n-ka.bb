SUMMARY = "Georgian localization files for LibreOffice"
DESCRIPTION = "Provides Georgian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-ka-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "ca0962242ca18038a12ef64bbe9d91320f300c8cf2eb0cb4ff4c9fa7ba427e3cdca924ebfcb6bbe2538da8adffa0fbceed9f83df365c36e1049c53c2f5064402"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ka \
libreoffice-l10n-ka \
locale-libreoffice-ka"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
