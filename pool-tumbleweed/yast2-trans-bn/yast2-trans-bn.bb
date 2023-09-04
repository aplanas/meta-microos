SUMMARY = "YaST2 - Bengali Translations"
DESCRIPTION = "YaST2 - Translations for Bengali."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-bn-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "c4c1baeb15bdbd54e474a693193d1937c0004e1f44cbc82a5cda232cff29c3ea15b4a8ec9b98802c132c25c16ab8555dd2d5a1bbd3d40f27031a1a0a877d4454"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-bn \
yast2-trans-bn"

RDEPENDS:${PN} += ""

inherit rpm
