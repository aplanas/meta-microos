SUMMARY = "YaST2 - Vietnamese Translations"
DESCRIPTION = "YaST2 - Translations for Vietnamese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-vi-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "86c06e715a2d6764b1bc195e037972c7cdc6591ebe5b07b2488082ca2d716dc3e0dfa702b9c687dc4e1e498efd5499203dc5457545ab37e2fb3d45d0aa18930d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-vi \
yast2-trans-vi"

RDEPENDS:${PN} += ""

inherit rpm
