SUMMARY = "YaST2 - Estonian Translations"
DESCRIPTION = "YaST2 - Translations for Estonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-et-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "ea8a290261251ba1e126dd1fb9891a5d286f75bb70f98a838b0e155af07bfb757d7a264c50e9e089a482b441a44da7ef3625c86fd3ca6fbc821e8062bc806ae5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-et \
yast2-trans-et"

RDEPENDS:${PN} += ""

inherit rpm
