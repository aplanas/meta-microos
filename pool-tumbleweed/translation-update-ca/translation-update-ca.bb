SUMMARY = "Translation Updates for Catalan"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-ca-15.1-3.1.noarch.rpm"
RPM_HASH = "2cf1e14f5dfd20eb1b73d8f8ca86234f669e88c290c2a7b07a2b1616bb5d2bab8d8bf2cb81c256166a5ab968e54111f2c4031a09c656aef13123c9aad20c0525"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-translation-update-ca \
translation-update-ca"

RDEPENDS:${PN} += "translation-update"

inherit rpm
