SUMMARY = "Translations for package qps"
DESCRIPTION = "Provides translations for the 'qps' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.7.0"

RPM_NAME = "qps-lang-2.7.0-1.2.noarch.rpm"
RPM_HASH = "e8fbba927c96b51d7c2ac46d4ead50ea558e65720d4a98a3fdb2481cd333f83878d151a791ad92f7a30fda60b53b5dc5027ea56fa47a162a516747d51f1faaf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qps-lang \
qps-lang-all"

RDEPENDS:${PN} += "qps"

inherit rpm
