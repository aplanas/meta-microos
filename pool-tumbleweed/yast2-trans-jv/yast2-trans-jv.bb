SUMMARY = "YaST2 - Javanese Translations"
DESCRIPTION = "YaST2 - Translations for Javanese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-jv-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "2d9512f6e5a06bf666cf0b539ef8ea32eee987d2a76d478c3abb8aa184e6ad96605b724e3ce988499d49664d8263f2b60b033bf6d965322224cd5adf2a4c29e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-jv \
yast2-trans-jv"

RDEPENDS:${PN} += ""

inherit rpm
