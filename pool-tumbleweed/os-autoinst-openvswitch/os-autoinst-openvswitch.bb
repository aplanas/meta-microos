SUMMARY = "Openvswitch support for os-autoinst"
DESCRIPTION = "This package contains openvswitch support for os-autoinst."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1683886197.05274f7"

RPM_NAME = "os-autoinst-openvswitch-4.6.1683886197.05274f7-1.1.aarch64.rpm"
RPM_HASH = "e7ca7e6db279d5f3684a8f5f588b767d771ca29e3c2dbcc1dd796e53c0792ee1934ec14c8ab2e5d95e955872be3123ce06cc35878357d512c9aac5430ab91e87"

RPROVIDES:${PN} += "config-os-autoinst-openvswitch \
os-autoinst-openvswitch"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
openvswitch \
openvswitch-switch \
os-autoinst"

inherit rpm
