SUMMARY = "Translation Updates for Portuguese"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-pt-15.1-3.1.noarch.rpm"
RPM_HASH = "b23880aa826963549d105002608409eef653736c312ac608eb0dfd5f14c8a13e85a9cf7a04f44a118784ba60ad63dc41166a4a3b01cc82b4e7d4a53a9b5627c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:pt) \
translation-update-pt"
RDEPENDS:${PN} += "translation-update"

inherit rpm
