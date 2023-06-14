SUMMARY = "Translation Updates for Dzongkha"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-dz-15.1-3.1.noarch.rpm"
RPM_HASH = "6d8a7388260a63c08288d676c2f8c0494838ceda49ba031a87597c1d0debda1150cad3d9f1e3ccec4cef088583dec77d109b46bfafab1387917109225bf89720"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-translation-update-dz \
translation-update-dz"

RDEPENDS:${PN} += "translation-update"

inherit rpm
