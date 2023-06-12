SUMMARY = "Translation Updates for Galician"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-gl-15.1-3.1.noarch.rpm"
RPM_HASH = "2ff4ec8f137e359a5a78aff9240187b7d8a6d002f3336d188219c7fb165eb05fd74fe9bd46f3c226f50be3c3be69155190985c8d2f73ff46ae5df6e0e33ed2d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:gl) \
translation-update-gl"
RDEPENDS:${PN} += "translation-update"

inherit rpm
