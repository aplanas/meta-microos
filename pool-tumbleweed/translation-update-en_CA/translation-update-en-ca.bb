SUMMARY = "Translation Updates for Canadian English"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-en_CA-15.1-3.1.noarch.rpm"
RPM_HASH = "550d6e2d6f44fc02af38eee70f7179efb20db375d41a327587c79f33a29be7375436302082bbdcfc75c82435ee2df1ddb78e56679e6573dcd5f219d6b2ec1447"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:en_CA) \
translation-update-en_CA"

RDEPENDS:${PN} += "translation-update"

inherit rpm
