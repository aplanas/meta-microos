SUMMARY = "Calendar for vim"
DESCRIPTION = "Plugin for vim that displays simple calendar in the side window."
LICENSE = "BSD-3-Clause"

PV = "2.5"

RPM_NAME = "vim-plugin-calendar-2.5-56.1.noarch.rpm"
RPM_HASH = "2b17f144b0b4ecb7a31dfb38a3ad1c98604fc193596da432861644908b552f2dc3a6daa323cc68dede84cecdc1a047861cc40115430f6ef41e962091f6f4d568"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-calendar"

RDEPENDS:${PN} += "vim"

inherit rpm
