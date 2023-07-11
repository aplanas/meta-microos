SUMMARY = "Translations for package kup-backup"
DESCRIPTION = "Provides translations for the 'kup-backup' package."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "0.9.1"

RPM_NAME = "kup-backup-lang-0.9.1-2.6.noarch.rpm"
RPM_HASH = "5de896229010af4fc4e410d3407c84c7b94f0b26d64efef5711e880c0a22e9406d3d5cd03312d8131d9b633b6910293bf425c83b0f5a65b0d0865ec7199971ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kup-backup-lang \
kup-backup-lang-all \
locale-kup-backup-bs \
locale-kup-backup-ca \
locale-kup-backup-ca@valencia \
locale-kup-backup-cs \
locale-kup-backup-da \
locale-kup-backup-de \
locale-kup-backup-en-GB \
locale-kup-backup-es \
locale-kup-backup-et \
locale-kup-backup-eu \
locale-kup-backup-fi \
locale-kup-backup-fr \
locale-kup-backup-hu \
locale-kup-backup-it \
locale-kup-backup-ko \
locale-kup-backup-lt \
locale-kup-backup-nl \
locale-kup-backup-pl \
locale-kup-backup-pt \
locale-kup-backup-pt-BR \
locale-kup-backup-ru \
locale-kup-backup-sk \
locale-kup-backup-sl \
locale-kup-backup-sv \
locale-kup-backup-uk \
locale-kup-backup-zh-CN \
locale-kup-backup-zh-TW"

RDEPENDS:${PN} += "kup-backup"

inherit rpm
