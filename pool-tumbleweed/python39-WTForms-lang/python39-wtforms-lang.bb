SUMMARY = "Translations for builtin WTForms messages"
DESCRIPTION = "Translations for builtin WTForms messages. \
 \
WTForms is a forms validation and rendering library for Python web development."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python39-WTForms-lang-3.0.1-2.8.noarch.rpm"
RPM_HASH = "f2c534a4f25fa75966ce4513c3c1f9671a5d047a6a2961b6131304970757c996f205d31649554e0e9ab0373282b8865efc4dbf150b0cee59f7120814b97ab91c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-python39-WTForms-ar \
locale-python39-WTForms-bg \
locale-python39-WTForms-ca \
locale-python39-WTForms-cs-CZ \
locale-python39-WTForms-cy \
locale-python39-WTForms-de \
locale-python39-WTForms-de-CH \
locale-python39-WTForms-el \
locale-python39-WTForms-en \
locale-python39-WTForms-es \
locale-python39-WTForms-et \
locale-python39-WTForms-fa \
locale-python39-WTForms-fi \
locale-python39-WTForms-fr \
locale-python39-WTForms-he \
locale-python39-WTForms-hu \
locale-python39-WTForms-it \
locale-python39-WTForms-ja \
locale-python39-WTForms-ko \
locale-python39-WTForms-nb \
locale-python39-WTForms-nl \
locale-python39-WTForms-pl \
locale-python39-WTForms-pt \
locale-python39-WTForms-ru \
locale-python39-WTForms-sk \
locale-python39-WTForms-sv \
locale-python39-WTForms-tr \
locale-python39-WTForms-uk \
locale-python39-WTForms-zh \
locale-python39-WTForms-zh-TW \
python39-WTForms-lang"

RDEPENDS:${PN} += "python39-WTForms"

inherit rpm
