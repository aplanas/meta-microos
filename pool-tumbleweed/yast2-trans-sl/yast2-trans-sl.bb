SUMMARY = "YaST2 - Slovene Translations"
DESCRIPTION = "YaST2 - Translations for Slovene."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-sl-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "56a211420012484419915c7bae8ee067e5f29575327a83973cdb4806d9c93abc9b295eafde4b1d59f37fd0b2ca7c2855a248325006e79dedc5519a0a456a780b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sl \
yast2-trans-sl"

RDEPENDS:${PN} += ""

inherit rpm
