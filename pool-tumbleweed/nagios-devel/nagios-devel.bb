SUMMARY = "Development files for Nagios"
DESCRIPTION = "Nagios is a program that will monitor hosts and services on your \
network. It has the ability to email or page you when a problem arises \
and when a problem is resolved. Nagios is written in C and is designed \
to run under Linux (and some other *NIX variants) as a background \
process, intermittently running checks on various services that you \
specify. \
 \
This package provides include files that Nagios-related applications \
may compile against."
LICENSE = "GPL-2.0-or-later"

PV = "4.4.7"

RPM_NAME = "nagios-devel-4.4.7-2.5.aarch64.rpm"
RPM_HASH = "01d5faa2d3f783c72e1cb8c7ba8cbeff29b04a2c54e35d57657152d08b221786c60ee0d3c45fc085ec9da13ed301a9339c71799ea52bdf3b47ded70219ace7e1"

RPROVIDES:${PN} += "nagios-devel"

RDEPENDS:${PN} += "gcc \
nagios"

inherit rpm
