SUMMARY = "YaST2 - Serbian (Latin) Translations"
DESCRIPTION = "YaST2 - Translations for Serbian (Latin)."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-sr-latin-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "4583736509150a9a19d3926bb7e9f925131a4e26112337c63f806f6b0fdf9c5ae1be12752f28229794226e112e83e4fd19224ae3fdd9d0fe6651a222b8d2bc9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sr@latin \
yast2-trans-sr-latin"

RDEPENDS:${PN} += ""

inherit rpm
