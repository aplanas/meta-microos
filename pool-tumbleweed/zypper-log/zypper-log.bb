SUMMARY = "CLI for accessing the zypper logfile"
DESCRIPTION = "CLI for accessing the zypper logfile"
LICENSE = "GPL-2.0-or-later"

PV = "1.14.61"

RPM_NAME = "zypper-log-1.14.61-1.1.noarch.rpm"
RPM_HASH = "02860996ef331b8c470b393c1047a8ad60b97079fb97168cb06a46a1cc29aef7e9ea1d2818f2218edd3c18620c5d3b85df381d7a9be7fade30e92457e95499da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zypper-log"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/grep"

inherit rpm
