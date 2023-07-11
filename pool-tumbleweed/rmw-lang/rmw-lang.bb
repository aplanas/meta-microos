SUMMARY = "Translations for package rmw"
DESCRIPTION = "Provides translations for the 'rmw' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.1"

RPM_NAME = "rmw-lang-0.9.1-1.2.noarch.rpm"
RPM_HASH = "c6296bad7628d519341db678348a238ede5d133ba8392bc2376405e3b8cca4473d29d6f185b71ab400d7abf68aa393d202b16d9f65d101daaf9b714e2726bf49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-rmw-de \
locale-rmw-es-MX \
locale-rmw-hi \
locale-rmw-nl \
locale-rmw-pl \
locale-rmw-pt-BR \
locale-rmw-ru \
locale-rmw-uk \
rmw-lang \
rmw-lang-all"

RDEPENDS:${PN} += "rmw"

inherit rpm
