SUMMARY = "Translation Updates for German"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-de-15.1-3.1.noarch.rpm"
RPM_HASH = "31979cbe7a446ac8cd08e03ff6f0afbe2508bbe30cae0a94244ba79fc5be0849e6b49c5e5968d6088d2ecc00029e62d23773da3ef97381a8d6c12e6ad319f021"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-translation-update-de \
translation-update-de"

RDEPENDS:${PN} += "translation-update"

inherit rpm
