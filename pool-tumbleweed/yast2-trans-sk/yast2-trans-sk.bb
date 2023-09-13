SUMMARY = "YaST2 - Slovak Translations"
DESCRIPTION = "YaST2 - Slovak Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-sk-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "c193044a19823e0672a2e435bfeeb8a4968fece80388b01b1c67287fe6a1f8868bfa334f3a9594011a26e3aca41b01c41bb5702928457b4444c66a6c36f41454"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sk \
yast2-trans-sk"

RDEPENDS:${PN} += ""

inherit rpm
