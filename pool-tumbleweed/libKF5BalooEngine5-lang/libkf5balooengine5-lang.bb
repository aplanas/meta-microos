SUMMARY = "Translations for package libKF5BalooEngine5"
DESCRIPTION = "Provides translations for the 'libKF5BalooEngine5' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.109.0"

RPM_NAME = "libKF5BalooEngine5-lang-5.109.0-1.1.noarch.rpm"
RPM_HASH = "38ae446fe6f8b1a8aeeafe08deb3173cd41f0c64549cabfa96bf30d61d56ba8ad93909564c3e8208469c2a0e7792b4f697863f5e3917ff23cbb1850250387f95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5BalooEngine5-lang \
libKF5BalooEngine5-lang-all \
locale-libKF5BalooEngine5-ar \
locale-libKF5BalooEngine5-az \
locale-libKF5BalooEngine5-bg \
locale-libKF5BalooEngine5-ca \
locale-libKF5BalooEngine5-ca@valencia \
locale-libKF5BalooEngine5-cs \
locale-libKF5BalooEngine5-da \
locale-libKF5BalooEngine5-de \
locale-libKF5BalooEngine5-el \
locale-libKF5BalooEngine5-en-GB \
locale-libKF5BalooEngine5-es \
locale-libKF5BalooEngine5-et \
locale-libKF5BalooEngine5-eu \
locale-libKF5BalooEngine5-fi \
locale-libKF5BalooEngine5-fr \
locale-libKF5BalooEngine5-gl \
locale-libKF5BalooEngine5-hu \
locale-libKF5BalooEngine5-ia \
locale-libKF5BalooEngine5-id \
locale-libKF5BalooEngine5-it \
locale-libKF5BalooEngine5-ja \
locale-libKF5BalooEngine5-ka \
locale-libKF5BalooEngine5-ko \
locale-libKF5BalooEngine5-lt \
locale-libKF5BalooEngine5-ml \
locale-libKF5BalooEngine5-nl \
locale-libKF5BalooEngine5-nn \
locale-libKF5BalooEngine5-pl \
locale-libKF5BalooEngine5-pt \
locale-libKF5BalooEngine5-pt-BR \
locale-libKF5BalooEngine5-ro \
locale-libKF5BalooEngine5-ru \
locale-libKF5BalooEngine5-sk \
locale-libKF5BalooEngine5-sl \
locale-libKF5BalooEngine5-sv \
locale-libKF5BalooEngine5-ta \
locale-libKF5BalooEngine5-tr \
locale-libKF5BalooEngine5-uk \
locale-libKF5BalooEngine5-zh-CN \
locale-libKF5BalooEngine5-zh-TW"

RDEPENDS:${PN} += "libKF5BalooEngine5"

inherit rpm
