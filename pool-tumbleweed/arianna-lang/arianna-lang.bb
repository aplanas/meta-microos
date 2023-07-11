SUMMARY = "Translations for package arianna"
DESCRIPTION = "Provides translations for the 'arianna' package."
LICENSE = "GPL-3.0-only"

PV = "1.1.0"

RPM_NAME = "arianna-lang-1.1.0-1.1.noarch.rpm"
RPM_HASH = "5a3c837c2cc90f88a185bdfe079990e1a50147a7dba553513eef7fb1454747c51da35d15cbcaddb38989a1e705a48ce9a4b8fbf80baa204970ec3f81619798b5"
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
locale-arianna-nl \
locale-arianna-pt \
locale-arianna-sk \
locale-arianna-sl \
locale-arianna-tr \
locale-arianna-uk \
locale-arianna-zh-CN"

RDEPENDS:${PN} += "arianna"

inherit rpm
