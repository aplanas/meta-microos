SUMMARY = "Translations for package ghostwriter"
DESCRIPTION = "Provides translations for the 'ghostwriter' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "ghostwriter-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "5a5521b44aebdac8d9cfedbed94f47aab1ba763f69b045795ec072f2001072fa330de0890798b632aa0a7f1c9c77cd6edb1eddf38f6eb648dbaefd1ad27f5a96"
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
locale-ghostwriter-lt \
locale-ghostwriter-nl \
locale-ghostwriter-pl \
locale-ghostwriter-pt \
locale-ghostwriter-ru \
locale-ghostwriter-sk \
locale-ghostwriter-sl \
locale-ghostwriter-tr \
locale-ghostwriter-uk \
locale-ghostwriter-zh-CN \
locale-ghostwriter-zh-TW"

RDEPENDS:${PN} += "ghostwriter"

inherit rpm
