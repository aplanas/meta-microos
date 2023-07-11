SUMMARY = "Translations for package radeontop"
DESCRIPTION = "Provides translations for the 'radeontop' package."
LICENSE = "GPL-3.0-only"

PV = "1.4"

RPM_NAME = "radeontop-lang-1.4-1.10.noarch.rpm"
RPM_HASH = "28849049a9ddc7b2f61e32abec21769948e625374e7751e797d3c8682b894e67778154d0a3be1b0abe142a1b89073903fc36fb38a936d2d70b207691c51ea0ae"
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
