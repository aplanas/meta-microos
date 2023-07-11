SUMMARY = "Translations for package dc3dd"
DESCRIPTION = "Provides translations for the 'dc3dd' package."
LICENSE = "GPL-3.0-only"

PV = "7.3.1"

RPM_NAME = "dc3dd-lang-7.3.1-1.1.noarch.rpm"
RPM_HASH = "562113f967030cf60b38d2874b84ad5e1fa39e2ad1dc052a8c508e91a225dc0c8b584297a9c81042eedb5334bbcac8314cc7f7ffb5b74ca4688bedea79e94b49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dc3dd-lang \
dc3dd-lang-all \
locale-dc3dd-af \
locale-dc3dd-be \
locale-dc3dd-bg \
locale-dc3dd-ca \
locale-dc3dd-cs \
locale-dc3dd-da \
locale-dc3dd-de \
locale-dc3dd-el \
locale-dc3dd-es \
locale-dc3dd-et \
locale-dc3dd-eu \
locale-dc3dd-fi \
locale-dc3dd-fr \
locale-dc3dd-ga \
locale-dc3dd-gl \
locale-dc3dd-hu \
locale-dc3dd-it \
locale-dc3dd-ja \
locale-dc3dd-ko \
locale-dc3dd-lt \
locale-dc3dd-ms \
locale-dc3dd-nb \
locale-dc3dd-nl \
locale-dc3dd-pl \
locale-dc3dd-pt \
locale-dc3dd-pt-BR \
locale-dc3dd-ru \
locale-dc3dd-sk \
locale-dc3dd-sl \
locale-dc3dd-sv \
locale-dc3dd-tr \
locale-dc3dd-uk \
locale-dc3dd-vi \
locale-dc3dd-zh-CN \
locale-dc3dd-zh-TW"

RDEPENDS:${PN} += "dc3dd"

inherit rpm
