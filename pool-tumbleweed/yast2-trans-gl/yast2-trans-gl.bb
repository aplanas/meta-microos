SUMMARY = "YaST2 - Galician Translations"
DESCRIPTION = "YaST2 - Galician translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-gl-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "44647353855e3bbe0ac68eaf9900e18cd64c985416112ba7dcdfb6fb2349252ae34fb6238765ee248175123ab0ed23c4ec72c97a541dbad172a99f672306c4a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-gl \
yast2-trans-gl"

RDEPENDS:${PN} += ""

inherit rpm
