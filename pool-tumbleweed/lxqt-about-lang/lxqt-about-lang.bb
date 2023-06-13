SUMMARY = "Translations for package lxqt-about"
DESCRIPTION = "Provides translations for the 'lxqt-about' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-about-lang-1.3.0-1.1.noarch.rpm"
RPM_HASH = "82545e285ebbae03850ef4fdd8a84012e868af543f7ff1ec370de2b800ac7d476eafe7663e19d9fcd8d76d24e6ab0179e69df48a66e3da1cef50f4efbe9aa4d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-about-lang \
lxqt-about-lang-all"

RDEPENDS:${PN} += "lxqt-about"

inherit rpm
