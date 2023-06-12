SUMMARY = "Translation Updates for Punjabi"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-pa-15.1-3.1.noarch.rpm"
RPM_HASH = "ca395b465de2da870703efc2d2b5ee7711e0ad345590fc19552e183049d787f7066ca8a3e041d6489c1399459ff9c2ad2fc43db0ceb5066b76223acaf272a17c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:pa) \
translation-update-pa"
RDEPENDS:${PN} += "translation-update"

inherit rpm
