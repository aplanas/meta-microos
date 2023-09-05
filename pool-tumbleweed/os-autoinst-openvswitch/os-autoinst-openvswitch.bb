SUMMARY = "Openvswitch support for os-autoinst"
DESCRIPTION = "This package contains openvswitch support for os-autoinst."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1693332527.fb060dc"

RPM_NAME = "os-autoinst-openvswitch-4.6.1693332527.fb060dc-1.1.aarch64.rpm"
RPM_HASH = "653f49df5c8b9df8b4051f854421375ef7c10aa281ef5813a9c6fbe784d684289fac48e1ce209722e9a9c9052a77ff9ce6ede534bab50d886d6a9f0887640528"

RPROVIDES:${PN} += "config-os-autoinst-openvswitch \
os-autoinst-openvswitch"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
openvswitch \
openvswitch-switch \
os-autoinst"

inherit rpm
