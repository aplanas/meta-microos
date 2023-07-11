SUMMARY = "Translations for builtin WTForms messages"
DESCRIPTION = "Translations for builtin WTForms messages. \
 \
WTForms is a forms validation and rendering library for Python web development."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python310-WTForms-lang-3.0.1-2.8.noarch.rpm"
RPM_HASH = "dfd88a5aaf83382424b068152aece0271dde66a9e398d02a4b79b6fe3446480463d9d3b5b704fdc32c309ed485fb44050f832ea9932a05259644ccfdad05b35f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-python310-WTForms-ar \
locale-python310-WTForms-bg \
locale-python310-WTForms-ca \
locale-python310-WTForms-cs-CZ \
locale-python310-WTForms-cy \
locale-python310-WTForms-de \
locale-python310-WTForms-de-CH \
locale-python310-WTForms-el \
locale-python310-WTForms-en \
locale-python310-WTForms-es \
locale-python310-WTForms-et \
locale-python310-WTForms-fa \
locale-python310-WTForms-fi \
locale-python310-WTForms-fr \
locale-python310-WTForms-he \
locale-python310-WTForms-hu \
locale-python310-WTForms-it \
locale-python310-WTForms-ja \
locale-python310-WTForms-ko \
locale-python310-WTForms-nb \
locale-python310-WTForms-nl \
locale-python310-WTForms-pl \
locale-python310-WTForms-pt \
locale-python310-WTForms-ru \
locale-python310-WTForms-sk \
locale-python310-WTForms-sv \
locale-python310-WTForms-tr \
locale-python310-WTForms-uk \
locale-python310-WTForms-zh \
locale-python310-WTForms-zh-TW \
python310-WTForms-lang"

RDEPENDS:${PN} += "python310-WTForms"

inherit rpm
