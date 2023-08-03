SUMMARY = "Extra terminfo files for the foot terminal emulator"
DESCRIPTION = "This package contains extra terminfo files for the foot terminal emulator \
that provide more features than the files in the terminfo-base package. \
Set term=foot-extra or term=foot-extra-direct in foot.ini to \
take advantage of the files in this package."
LICENSE = "MIT"

PV = "1.15.2"

RPM_NAME = "foot-extra-terminfo-1.15.2-1.1.noarch.rpm"
RPM_HASH = "b67d184b091e0d4758357494e153f20cf27a494eb57ec282887e111eaff35fa98993a49e898c5707853bc2a1dca90a25e434e1e7d05c8b672b012fa8f4eb659d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "foot-extra-terminfo"

RDEPENDS:${PN} += ""

inherit rpm
