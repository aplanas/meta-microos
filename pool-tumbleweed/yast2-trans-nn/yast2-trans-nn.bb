SUMMARY = "YaST2 - Norwegian Nynorsk"
DESCRIPTION = "YaST2 - Translations for Norwegian Nynorsk."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-nn-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "c8530099b6077d88dd80e5131235d8c3d37d442c4b6f43b633d2f9803855a283312fcd6c7a4eb16f807ac2e7f62934090a9624f3949dd0400c4a16bd561280ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:nn) \
yast2-trans-nn"

RDEPENDS:${PN} += ""

inherit rpm
