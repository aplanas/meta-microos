SUMMARY = "Translation Updates for Lithuanian"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-lt-15.1-3.1.noarch.rpm"
RPM_HASH = "173f0a8a964d651c5b03ea5ecb577d583189de06cf2aee9adefde70d5c821faed4fdd84da05568fc10fc0b96b898ba0d7c27b6760bcf56bcd6fe6688a1ab3bb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:lt) \
translation-update-lt"
RDEPENDS:${PN} += "translation-update"

inherit rpm
