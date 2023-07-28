SUMMARY = "YaST2 - Spanish Translations"
DESCRIPTION = "YaST2 - Spanish Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-es-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "f68cf56c841526e067c581afd8049eedf5d7aeb3463fb71931151fb6d42eedd07b972c55c69c57c633bcdb525b80bb33c65ac765983c1b96cb96d802541e3c67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-es \
yast2-trans-es"

RDEPENDS:${PN} += ""

inherit rpm
