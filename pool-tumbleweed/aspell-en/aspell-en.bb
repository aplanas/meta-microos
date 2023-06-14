SUMMARY = "English Dictionaries for ASpell"
DESCRIPTION = "An English, Canadian English and British English dictionary for the ASpell \
spell checker."
LICENSE = "MIT & BSD-3-Clause"

PV = "2020.12.07"

RPM_NAME = "aspell-en-2020.12.07-2.3.aarch64.rpm"
RPM_HASH = "98ca456f7202c3d8595a258326679a8bb1e62878c43ea242a4eae3d7c3802d5918a5fad4b28f4fc5c26be601bd59994c7b5b0748704045f75d01a6e089de6285"

RPROVIDES:${PN} += "aspell-en \
locale-aspell-en"

RDEPENDS:${PN} += ""

inherit rpm
