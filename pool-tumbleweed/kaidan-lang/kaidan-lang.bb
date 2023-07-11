SUMMARY = "Translations for package kaidan"
DESCRIPTION = "Provides translations for the 'kaidan' package."
LICENSE = "AML & GPL-3.0-or-later & SUSE-GPL-3.0+-with-openssl-exception & MIT & CC-BY-SA-4.0"

PV = "0.9.1"

RPM_NAME = "kaidan-lang-0.9.1-1.2.noarch.rpm"
RPM_HASH = "1396243cdcac7dbe2de407ca0d5177265be1e75f833bc93e3f441339d26d1ca9fecc9ea6937fc0093daf3ae2d4ea99f783d3dc13cc2c8206a8f769e897beb701"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kaidan-lang \
kaidan-lang-all \
locale-kaidan-ar \
locale-kaidan-ca \
locale-kaidan-ca@valencia \
locale-kaidan-cs \
locale-kaidan-de \
locale-kaidan-el \
locale-kaidan-en-GB \
locale-kaidan-es \
locale-kaidan-eu \
locale-kaidan-fi \
locale-kaidan-fr \
locale-kaidan-gl \
locale-kaidan-he \
locale-kaidan-hu \
locale-kaidan-it \
locale-kaidan-ka \
locale-kaidan-ko \
locale-kaidan-ms \
locale-kaidan-nb \
locale-kaidan-nl \
locale-kaidan-pa \
locale-kaidan-pl \
locale-kaidan-pt \
locale-kaidan-pt-BR \
locale-kaidan-ru \
locale-kaidan-sk \
locale-kaidan-sl \
locale-kaidan-sv \
locale-kaidan-tr \
locale-kaidan-uk"

RDEPENDS:${PN} += "kaidan"

inherit rpm
