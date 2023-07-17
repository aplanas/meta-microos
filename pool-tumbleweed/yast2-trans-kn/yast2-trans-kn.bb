SUMMARY = "YaST2 - Kannada Translations"
DESCRIPTION = "YaST2 - Translations for Kannada."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-kn-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "ecc13b48969b1a9f424a0e2c22d74a7104c6568ffe3587d1b638ff5ad7b4798679f032e320b3480400cd824070a93120cffd057f44d62e445446d401579fe419"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ka \
yast2-trans-kn"

RDEPENDS:${PN} += ""

inherit rpm
