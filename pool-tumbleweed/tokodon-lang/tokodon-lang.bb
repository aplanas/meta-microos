SUMMARY = "Translations for package tokodon"
DESCRIPTION = "Provides translations for the 'tokodon' package."
LICENSE = "GPL-3.0-only"

PV = "23.08.0"

RPM_NAME = "tokodon-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "50f14f736c46e7f4d06ad48958b65af6bf8350095a63ce49535d43203acd29ae33d471c58cbdeac789063a7370f1f1d96bf0e1a1c8ec741233ca35e989a53737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tokodon-ca \
locale-tokodon-ca@valencia \
locale-tokodon-cs \
locale-tokodon-de \
locale-tokodon-en-GB \
locale-tokodon-es \
locale-tokodon-eu \
locale-tokodon-fi \
locale-tokodon-fr \
locale-tokodon-gl \
locale-tokodon-hu \
locale-tokodon-id \
locale-tokodon-is \
locale-tokodon-it \
locale-tokodon-ja \
locale-tokodon-ka \
locale-tokodon-ko \
locale-tokodon-lt \
locale-tokodon-nl \
locale-tokodon-pa \
locale-tokodon-pl \
locale-tokodon-pt \
locale-tokodon-pt-BR \
locale-tokodon-ru \
locale-tokodon-sk \
locale-tokodon-sl \
locale-tokodon-sv \
locale-tokodon-tr \
locale-tokodon-uk \
locale-tokodon-zh-CN \
locale-tokodon-zh-TW \
tokodon-lang \
tokodon-lang-all"

RDEPENDS:${PN} += "tokodon"

inherit rpm
