SUMMARY = "Translations for package radeontop"
DESCRIPTION = "Provides translations for the 'radeontop' package."
LICENSE = "GPL-3.0-only"

PV = "1.4"

RPM_NAME = "radeontop-lang-1.4-1.9.noarch.rpm"
RPM_HASH = "7783e14c287099ae1b2b31d6ce0eceb8b5853cb69b48b520107b57ec3a3bed06202a30e0d6ccf7fb2fd8cdf6ed0faa99b703c74c2c55772a6ed8e393ca2ada1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-radeontop-cs \
locale-radeontop-de \
locale-radeontop-el \
locale-radeontop-es \
locale-radeontop-fi \
locale-radeontop-fr \
locale-radeontop-ru \
locale-radeontop-sl \
locale-radeontop-tr \
locale-radeontop-zh-CN \
radeontop-lang \
radeontop-lang-all"

RDEPENDS:${PN} += "radeontop"

inherit rpm
