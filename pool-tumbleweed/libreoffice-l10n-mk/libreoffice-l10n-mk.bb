SUMMARY = "Macedonian localization files for LibreOffice"
DESCRIPTION = "Provides Macedonian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-mk-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "756fa1260c1da01e094ca4eb9c29e5ef796998b4763afef225172650329fd7bdce47ab4bb7e1e42300672ca1f7c047cfd03627176f9406ac20273583327b19bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mk \
libreoffice-l10n-mk \
locale-libreoffice-mk"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
