SUMMARY = "Translation Updates for Russian"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-ru-15.1-3.1.noarch.rpm"
RPM_HASH = "bdc02d654d2218d485b366a6c6ad68b4884f286c02f716c1f182e9f5bba62f71ebb31c1829872dcf3b6439e1a81e201f5a2a9f09b09f37692322bc39b8ac4f31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-translation-update-ru \
translation-update-ru"

RDEPENDS:${PN} += "translation-update"

inherit rpm
