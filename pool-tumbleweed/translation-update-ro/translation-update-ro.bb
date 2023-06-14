SUMMARY = "Translation Updates for Romanian"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-ro-15.1-3.1.noarch.rpm"
RPM_HASH = "b2bfbbf53f4a52a1ba7b3d44a18066175e23c226ecb787fd449f74c7f83b44f65bb758c2fba9fbe2649195ce0be08231af1b83ba121b5b37f8e5818b4f337a1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-translation-update-ro \
translation-update-ro"

RDEPENDS:${PN} += "translation-update"

inherit rpm
