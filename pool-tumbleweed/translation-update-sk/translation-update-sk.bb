SUMMARY = "Translation Updates for Slovak"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-sk-15.1-3.1.noarch.rpm"
RPM_HASH = "7c4b1a118783a3b5693bde5cc69fa222071a578f6a4c63f26a641662cfff89a5a4bc9a74c3e88f2062edcfcbcff3c77ba2311a02dd896234194b55e24ddca06e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-translation-update-sk \
translation-update-sk"

RDEPENDS:${PN} += "translation-update"

inherit rpm
