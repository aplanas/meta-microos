SUMMARY = "YaST2 - Portuguese Translations"
DESCRIPTION = "YaST2 - Translations for Portuguese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-pt-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "ce4b497735f34614263d966635ad88217de901a6b3879fa6d7670a41b56330823ef88655afc84f81c26289fe2391a1a0b2b46831c56efd13b7213bfa6b26d17d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:pt) \
yast2-trans-pt"

RDEPENDS:${PN} += ""

inherit rpm
