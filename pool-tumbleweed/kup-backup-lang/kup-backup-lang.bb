SUMMARY = "Translations for package kup-backup"
DESCRIPTION = "Provides translations for the 'kup-backup' package."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "0.9.1"

RPM_NAME = "kup-backup-lang-0.9.1-2.7.noarch.rpm"
RPM_HASH = "9649f8d670e94fad4ca98a23cb3f29e409230fe0fb46c609f3012c5244b87d480ca5b166fe4171268092bb08a49556f580671d2bebb7e2e1e22072f886e71327"
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
