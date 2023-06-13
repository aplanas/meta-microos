SUMMARY = "Translation Updates for Azerbaijani"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-az-15.1-3.1.noarch.rpm"
RPM_HASH = "9ec00ca7ac793b957097bd3653281c2d4b2e65cb3a796b9bd3dcc76078182357dab76e7bd9aaadb258660d1e21286930f09e8e931b28266241e49af846bdb5fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:az) \
translation-update-az"

RDEPENDS:${PN} += "translation-update"

inherit rpm
