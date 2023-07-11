SUMMARY = "Files from the contrib directory"
DESCRIPTION = "This package contains all the files from the contrib directory"
LICENSE = "GPL-2.0-or-later"

PV = "4.4.7"

RPM_NAME = "nagios-contrib-4.4.7-2.5.aarch64.rpm"
RPM_HASH = "85bb98e0f72bf68fe8473ee0e44215d1c4cee410e752daef9b4c6ca03908f9a649ff0aa47365549610acec2878ccc717facd5ece23bfb69987256248041725b1"

RPROVIDES:${PN} += "nagios-contrib"

RDEPENDS:${PN} += "/usr/bin/sh \
nagios"

inherit rpm
