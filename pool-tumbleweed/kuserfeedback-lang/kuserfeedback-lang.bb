SUMMARY = "Translations for package kuserfeedback"
DESCRIPTION = "Provides translations for the 'kuserfeedback' package."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "kuserfeedback-lang-1.2.0-1.15.noarch.rpm"
RPM_HASH = "2a727d66c640e29839d25b97cf57051f909175cb46722b70d257e55938c09ca4a003a0a209432ec92d15a64bf975708031f2dd00433de5e81f067a13394c0a8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kuserfeedback-lang \
kuserfeedback-lang-all \
locale-kuserfeedback-ar \
locale-kuserfeedback-az \
locale-kuserfeedback-ca \
locale-kuserfeedback-ca@valencia \
locale-kuserfeedback-cs \
locale-kuserfeedback-da \
locale-kuserfeedback-de \
locale-kuserfeedback-en-GB \
locale-kuserfeedback-es \
locale-kuserfeedback-et \
locale-kuserfeedback-fi \
locale-kuserfeedback-fr \
locale-kuserfeedback-gl \
locale-kuserfeedback-ia \
locale-kuserfeedback-it \
locale-kuserfeedback-ja \
locale-kuserfeedback-ko \
locale-kuserfeedback-lt \
locale-kuserfeedback-nl \
locale-kuserfeedback-nn \
locale-kuserfeedback-pl \
locale-kuserfeedback-pt \
locale-kuserfeedback-pt-BR \
locale-kuserfeedback-ru \
locale-kuserfeedback-sk \
locale-kuserfeedback-sl \
locale-kuserfeedback-sv \
locale-kuserfeedback-tr \
locale-kuserfeedback-uk \
locale-kuserfeedback-zh-CN \
locale-kuserfeedback-zh-TW"

RDEPENDS:${PN} += "kuserfeedback"

inherit rpm
