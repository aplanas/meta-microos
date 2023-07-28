SUMMARY = "YaST2 - Romanian Translations"
DESCRIPTION = "YaST2 - Translations for Romanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-ro-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "4f025386a74fc41c69bfd43b47d49e55a4329293cb342cce84546ec76520174c9dacbdb4b0716c6eef85d0da4458974752e9e83dc18e17431edeff12fe448f85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ro \
yast2-trans-ro"

RDEPENDS:${PN} += ""

inherit rpm
