SUMMARY = "YaST2 - Welsh Translations"
DESCRIPTION = "YaST2 - Welsh translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-cy-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "e9665fb7cdd46ed8e4974d7b7dcab5fd864a116aa61399c6c82af82ca0e9262595a024c8339d010cee7b95bfad2c0a0548bc4abada7387b51a6fdbf4a59ebf76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-cy \
yast2-trans-cy"

RDEPENDS:${PN} += ""

inherit rpm
