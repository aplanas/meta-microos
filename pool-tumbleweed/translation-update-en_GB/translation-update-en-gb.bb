SUMMARY = "Translation Updates for British English"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-en_GB-15.1-3.1.noarch.rpm"
RPM_HASH = "c0321a2bbe86e5ff2870b2e310928a732d2346e7d97c88c8bb5618e2c607396cb4f0ab526b1cec2a060a0f5734dd187abd4dccb25a97dea3cd06491ef4afdbcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:en_GB) \
translation-update-en_GB"

RDEPENDS:${PN} += "translation-update"

inherit rpm
