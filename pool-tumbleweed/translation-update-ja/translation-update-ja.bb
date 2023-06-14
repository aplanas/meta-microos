SUMMARY = "Translation Updates for Japanese"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-ja-15.1-3.1.noarch.rpm"
RPM_HASH = "3405982b2abae2087606eef48efc3eb9e04fb6a22f4256edb6216776e15c2762ccb48d8fd483d95f581aa75db6a7e0a0e5c4ff2fbf53c74378a27a7f18278ff0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-translation-update-ja \
translation-update-ja"

RDEPENDS:${PN} += "translation-update"

inherit rpm
