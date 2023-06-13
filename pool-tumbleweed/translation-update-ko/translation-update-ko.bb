SUMMARY = "Translation Updates for Korean"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-ko-15.1-3.1.noarch.rpm"
RPM_HASH = "11ec146bdaac719395c3837ca45b8bf57a4c2457c93674cea24d0875d45bd477837e63d3cca153dbbe33fe035b808e848374e56c4133484df673e50b584b00be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:ko) \
translation-update-ko"

RDEPENDS:${PN} += "translation-update"

inherit rpm
