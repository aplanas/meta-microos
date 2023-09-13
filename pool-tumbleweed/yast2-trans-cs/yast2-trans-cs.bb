SUMMARY = "YaST2 - Czech Translations"
DESCRIPTION = "YaST2 - Czech translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-cs-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "3fafa96f0c1ce628984979898df1eab74ba0c26e99c73014e6a8c43888d5d04857338b87b7c85d010c90cae61dd6f4f2e2978ac234dd170b15d24588c9320210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-cs \
yast2-trans-cs"

RDEPENDS:${PN} += ""

inherit rpm
