SUMMARY = "Translations for package ghostwriter"
DESCRIPTION = "Provides translations for the 'ghostwriter' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "ghostwriter-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "1851b8619adce997289db485783ccf8ebbc985a880605bebd12eb6b69b623a869f755fdcab165bf84ddb4a97031b7bf06c0823d0dffe31cb9647118d57280226"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghostwriter-lang \
ghostwriter-lang-all \
locale-ghostwriter-ca \
locale-ghostwriter-ca@valencia \
locale-ghostwriter-cs \
locale-ghostwriter-de \
locale-ghostwriter-en \
locale-ghostwriter-en-GB \
locale-ghostwriter-es \
locale-ghostwriter-eu \
locale-ghostwriter-fi \
locale-ghostwriter-fr \
locale-ghostwriter-id \
locale-ghostwriter-it \
locale-ghostwriter-ja \
locale-ghostwriter-ka \
locale-ghostwriter-ko \
locale-ghostwriter-lt \
locale-ghostwriter-nl \
locale-ghostwriter-pl \
locale-ghostwriter-pt \
locale-ghostwriter-pt-BR \
locale-ghostwriter-ru \
locale-ghostwriter-sk \
locale-ghostwriter-sl \
locale-ghostwriter-sv \
locale-ghostwriter-tr \
locale-ghostwriter-uk \
locale-ghostwriter-zh-CN \
locale-ghostwriter-zh-TW"

RDEPENDS:${PN} += "ghostwriter"

inherit rpm
