SUMMARY = "Translations for package arianna"
DESCRIPTION = "Provides translations for the 'arianna' package."
LICENSE = "GPL-3.0-only"

PV = "23.08.0"

RPM_NAME = "arianna-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "9eea73a447664eba3282846f1a79d280c61bfda7a51354cc3eafe63b1f746f357e14d5ff0030e2e45b55cd3db8061f8a49b1f164427c1f5a478c0784b61d8806"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arianna-lang \
arianna-lang-all \
locale-arianna-ca \
locale-arianna-ca@valencia \
locale-arianna-cs \
locale-arianna-de \
locale-arianna-en-GB \
locale-arianna-es \
locale-arianna-eu \
locale-arianna-fi \
locale-arianna-fr \
locale-arianna-gl \
locale-arianna-hu \
locale-arianna-ia \
locale-arianna-it \
locale-arianna-ka \
locale-arianna-ko \
locale-arianna-lt \
locale-arianna-nl \
locale-arianna-pt \
locale-arianna-sk \
locale-arianna-sl \
locale-arianna-sv \
locale-arianna-tr \
locale-arianna-uk \
locale-arianna-zh-CN"

RDEPENDS:${PN} += "arianna"

inherit rpm
