SUMMARY = "YaST2 - Spanish Translations"
DESCRIPTION = "YaST2 - Spanish Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-es-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "1c6205caa4200473e34d6794c03d1a12ff6251c007c308332127ba7b875f5cdc54f703c217ab5567a80c3d6333bb72e28fa0b2ca3d1501525a80ae5243e3ad2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-es \
yast2-trans-es"

RDEPENDS:${PN} += ""

inherit rpm
