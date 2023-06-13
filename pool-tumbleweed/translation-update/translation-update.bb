SUMMARY = "Translation Updates"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-15.1-3.1.noarch.rpm"
RPM_HASH = "27a951acfa4efafd30aa7169ee61158526f15d8a09bfeba4d40cb22e8840c97651e427ce5650e40aa04be6bfa77710335ecc925fc571fc30c433f216e653d28e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "translation-update"

RDEPENDS:${PN} += ""

inherit rpm
