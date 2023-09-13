SUMMARY = "YaST2 - Slovene Translations"
DESCRIPTION = "YaST2 - Translations for Slovene."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-sl-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "32e21e5a20adeeea8931639e39322b2a2c8977a1428d063ac833743c263447051df54e8cd89a1476eb9f98ac1fb1908f6d868d4d75eed59d91b2fb6196cdc30e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sl \
yast2-trans-sl"

RDEPENDS:${PN} += ""

inherit rpm
