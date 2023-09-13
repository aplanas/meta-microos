SUMMARY = "YaST2 - Bengali Translations"
DESCRIPTION = "YaST2 - Translations for Bengali."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-bn-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "0a1ed1d3fa752c6d0627b5730761c293d3a81c88ce01bf830e0a205df668b735a33b14236098505e52876a345537a7b81c5da6b14a44309a9e0dd0ce020d916f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-bn \
yast2-trans-bn"

RDEPENDS:${PN} += ""

inherit rpm
