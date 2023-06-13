SUMMARY = "Kashubian (kaszëbsczi) Dictionary for Aspell"
DESCRIPTION = "A Kashubian (kaszëbsczi) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.0"

RPM_NAME = "aspell-csb-0.02.0-2.14.aarch64.rpm"
RPM_HASH = "c1d21764bea3eab6fb121f918b4933c7437a91f290825686c479e3e14b300294935327bd2e6273c0df70eb1ddf975466d4d6afab614a44cbdaa5b34b9a73878b"

RPROVIDES:${PN} += "aspell-csb \
aspell-csb(aarch-64) \
locale(aspell:csb)"

RDEPENDS:${PN} += ""

inherit rpm
