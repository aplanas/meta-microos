SUMMARY = "Translations for builtin WTForms messages"
DESCRIPTION = "Translations for builtin WTForms messages. \
 \
WTForms is a forms validation and rendering library for Python web development."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python311-WTForms-lang-3.0.1-2.8.noarch.rpm"
RPM_HASH = "511179f478dc778a3431ddfc786ea17c5a274f06f5afc4a18d0a5d29597a2eb7fbf72fa054dfa7d498c6c46ace21d80120533aa16f5efda0b3cb055f5d2e9dc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-python311-WTForms-ar \
locale-python311-WTForms-bg \
locale-python311-WTForms-ca \
locale-python311-WTForms-cs-CZ \
locale-python311-WTForms-cy \
locale-python311-WTForms-de \
locale-python311-WTForms-de-CH \
locale-python311-WTForms-el \
locale-python311-WTForms-en \
locale-python311-WTForms-es \
locale-python311-WTForms-et \
locale-python311-WTForms-fa \
locale-python311-WTForms-fi \
locale-python311-WTForms-fr \
locale-python311-WTForms-he \
locale-python311-WTForms-hu \
locale-python311-WTForms-it \
locale-python311-WTForms-ja \
locale-python311-WTForms-ko \
locale-python311-WTForms-nb \
locale-python311-WTForms-nl \
locale-python311-WTForms-pl \
locale-python311-WTForms-pt \
locale-python311-WTForms-ru \
locale-python311-WTForms-sk \
locale-python311-WTForms-sv \
locale-python311-WTForms-tr \
locale-python311-WTForms-uk \
locale-python311-WTForms-zh \
locale-python311-WTForms-zh-TW \
python3-WTForms-lang \
python311-WTForms-lang"

RDEPENDS:${PN} += "python311-WTForms"

inherit rpm
