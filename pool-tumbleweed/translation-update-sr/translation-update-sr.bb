SUMMARY = "Translation Updates for Serbian"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-sr-15.1-3.1.noarch.rpm"
RPM_HASH = "1de787f35c38f5bd98ac1e64e0052636d0cd4cbb1fb379a35628e3a766465490b576bcc1e7388a5d8238312ad8c7da9877e378c70de830dafb9d843789047814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:sr) \
translation-update-sr"

RDEPENDS:${PN} += "translation-update"

inherit rpm
