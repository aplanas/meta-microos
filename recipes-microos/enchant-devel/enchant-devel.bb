SUMMARY = "Development files for the Enchant spell checking library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.15"

RPM_NAME = "enchant-devel-2.2.15-3.3.aarch64.rpm"
RPM_HASH = "3942240803c2176d6f37018369c2fa9b73994a371eaaf9d449848b1379c2885d1e0d58ed3f574759a3a933992c4b71fc4614e7b15c7fb2a2559b110d273e8735"

RPROVIDES:${PN} += "enchant-devel enchant-devel(aarch-64) pkgconfig(enchant-2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glib2-devel libenchant-2-2 libstdc++-devel pkgconfig(glib-2.0) pkgconfig(gmodule-no-export-2.0)"

inherit rpm
