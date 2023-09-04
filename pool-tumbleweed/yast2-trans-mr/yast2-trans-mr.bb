SUMMARY = "YaST2 - Marathi Translations"
DESCRIPTION = "YaST2 - Translations for Marathi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-mr-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "d3ce6eed25f29c9a355b316dc735eb9304b8d1347b14b17e8f426c499fe557da827d029fdbc1a25bd57c632e97487e7750d896409f353cfc4d9a0ec97becfd9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-mr \
yast2-trans-mr"

RDEPENDS:${PN} += ""

inherit rpm
