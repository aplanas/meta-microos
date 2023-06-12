SUMMARY = "Translation Updates for Basque"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-eu-15.1-3.1.noarch.rpm"
RPM_HASH = "4bd7c3796d72a291845b7f16524ac0c05148d2752b675f58111186b8359e6dd73d3fd007a66d9fa801588d8705de1a1c8c65312b870b042aa52cc2c270ea2df6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:eu) \
translation-update-eu"
RDEPENDS:${PN} += "translation-update"

inherit rpm
