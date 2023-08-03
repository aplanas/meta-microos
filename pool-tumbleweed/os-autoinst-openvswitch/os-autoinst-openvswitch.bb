SUMMARY = "Openvswitch support for os-autoinst"
DESCRIPTION = "This package contains openvswitch support for os-autoinst."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1690540437.6c17e24"

RPM_NAME = "os-autoinst-openvswitch-4.6.1690540437.6c17e24-1.1.aarch64.rpm"
RPM_HASH = "3a186cc29faaf35552a99cabce122da8f1be14430be3f36d1f0908aa2d8afe4f9eebbef9710598e3ce87f14cb085d223e688224fe5485d3c5472a8a44cce0c98"

RPROVIDES:${PN} += "config-os-autoinst-openvswitch \
os-autoinst-openvswitch"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
openvswitch \
openvswitch-switch \
os-autoinst"

inherit rpm
