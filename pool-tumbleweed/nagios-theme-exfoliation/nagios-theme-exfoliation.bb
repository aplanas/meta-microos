SUMMARY = "Nagios Core web interface"
DESCRIPTION = "Exfoliation is a simple makeover for the Nagios Core web interface. It consists \
of two folders that overlay on a stock Nagios installation."
LICENSE = "GPL-2.0-or-later"

PV = "4.4.7"

RPM_NAME = "nagios-theme-exfoliation-4.4.7-2.4.noarch.rpm"
RPM_HASH = "cc56e9f5658ea7511050d9b16eb1be1683d2a2a5a648a1222a78ba94705076fe808813f0df685ad397e4f6e6fb0f62f6ae010b3da29ce8cfd1590656c6218e5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nagios-theme-exfoliation"
RDEPENDS:${PN} += "/bin/sh \
nagios-theme-switcher \
nagios-www"

inherit rpm
