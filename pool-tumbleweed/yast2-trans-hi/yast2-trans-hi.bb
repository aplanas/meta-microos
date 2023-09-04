SUMMARY = "YaST2 - Hindi Translations"
DESCRIPTION = "YaST2 - Translations for Hindi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-hi-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "c5ad743fa0104f7e969e6a7886e6ba8166fd043e8e79c71e370cace5e746ea740bce9f02e84aa5f28c40173137a3ec5149e43a45038af8d9395ffa9b67b2861b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-hi \
yast2-trans-hi"

RDEPENDS:${PN} += ""

inherit rpm
