SUMMARY = "Translation Updates for Norwegian bokmål"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-nb-15.1-3.1.noarch.rpm"
RPM_HASH = "538915b15e120012fdc2edad09ba3c90c05df81fadffc343e9eb163c9ad8dc557be6689a69dbfd4d6278502b3221624cf2a9ffc796669537bb695d409ee9043b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:nb) \
translation-update-nb"

RDEPENDS:${PN} += "translation-update"

inherit rpm
