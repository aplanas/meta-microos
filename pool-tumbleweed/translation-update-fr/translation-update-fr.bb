SUMMARY = "Translation Updates for French"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-fr-15.1-3.1.noarch.rpm"
RPM_HASH = "89338803fb0df2f2126e9aa762d30b0b06e68d471568c898bf6faf64f3787b914939b3263876c5ad30e0d93a59533fa6983ae78ac8b5bc14c48c506f9627974e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:fr) \
translation-update-fr"

RDEPENDS:${PN} += "translation-update"

inherit rpm
