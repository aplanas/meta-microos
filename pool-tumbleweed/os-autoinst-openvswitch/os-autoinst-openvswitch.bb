SUMMARY = "Openvswitch support for os-autoinst"
DESCRIPTION = "This package contains openvswitch support for os-autoinst."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1692873408.b5fd97a"

RPM_NAME = "os-autoinst-openvswitch-4.6.1692873408.b5fd97a-1.1.aarch64.rpm"
RPM_HASH = "72e45826e3ddd60508a352960a0e6f2bcbd8a790b0e859be61cdde6748507bcf5f9a9c298bcb2767659c8e99313bc6dc0447366084a460bee2b1c7e33e91737a"

RPROVIDES:${PN} += "config-os-autoinst-openvswitch \
os-autoinst-openvswitch"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
openvswitch \
openvswitch-switch \
os-autoinst"

inherit rpm
