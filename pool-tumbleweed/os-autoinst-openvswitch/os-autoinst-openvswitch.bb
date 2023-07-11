SUMMARY = "Openvswitch support for os-autoinst"
DESCRIPTION = "This package contains openvswitch support for os-autoinst."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1688579291.d13a461"

RPM_NAME = "os-autoinst-openvswitch-4.6.1688579291.d13a461-1.1.aarch64.rpm"
RPM_HASH = "871c9d7556d0b3eb587c071258f328140023ef351d68000d25bb8b186b5a42109f5db218ee11742d81e31fbe765da67ad9ae319a9cc947d6bdeca8413d105c1c"

RPROVIDES:${PN} += "config-os-autoinst-openvswitch \
os-autoinst-openvswitch"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
openvswitch \
openvswitch-switch \
os-autoinst"

inherit rpm
