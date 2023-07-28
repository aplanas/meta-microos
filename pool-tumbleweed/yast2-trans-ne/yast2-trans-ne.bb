SUMMARY = "YaST2 - Nepali Translations"
DESCRIPTION = "YaST2 - Translations for Nepali."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-ne-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "219502d80ecd04ef377b7d3070e6dc779a64b87a0609e111a29c4c95707cd3ad903311d117399e1155b5b7733ff3b28417b46af4bb3d341cff4a4b351fe4f12c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ne \
yast2-trans-ne"

RDEPENDS:${PN} += ""

inherit rpm
