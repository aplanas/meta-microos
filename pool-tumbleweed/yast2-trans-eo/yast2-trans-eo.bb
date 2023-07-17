SUMMARY = "YaST2 - Esperanto Translations"
DESCRIPTION = "YaST2 - Esperanto Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-eo-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "16c14f13df3159f5605b8ec671c7943e84e3f03e567eea6ed85b940e83a71618b144cddb75f8facd82d61bdb14f2886063c602d8acab6df5ba1254569050eaf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-eo \
yast2-trans-eo"

RDEPENDS:${PN} += ""

inherit rpm
