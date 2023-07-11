SUMMARY = "Nagios Core web interface"
DESCRIPTION = "Exfoliation is a simple makeover for the Nagios Core web interface. It consists \
of two folders that overlay on a stock Nagios installation."
LICENSE = "GPL-2.0-or-later"

PV = "4.4.7"

RPM_NAME = "nagios-theme-exfoliation-4.4.7-2.5.noarch.rpm"
RPM_HASH = "25d79f94c6227864907352050237401f32407c6b4376abb736e70d7505bcb770d9f44fffa071a9c4da6d4c39468aecc346bbfe792de5589753ebf00c4e45f27c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nagios-theme-exfoliation"

RDEPENDS:${PN} += "/usr/bin/sh \
nagios-theme-switcher \
nagios-www"

inherit rpm
