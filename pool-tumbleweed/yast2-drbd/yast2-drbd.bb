SUMMARY = "YaST2 - DRBD Configuration"
DESCRIPTION = "YaST2 - Configuration of Distributed Replicated Block Devices. With \
this module you can configure a distributed storage system, frequently \
used on high availability (HA) clusters."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "yast2-drbd-4.6.1-1.1.aarch64.rpm"
RPM_HASH = "985d2c1705deb3e62a57ea9a5b71e5e138dec8c3196d73c87da2f18443ed8b8dc124a83981b6d3eb03df91ffc610f086ea4b593f3c21d7071e1374e01ed7d1bf"

RPROVIDES:${PN} += "yast2-drbd"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby \
drbd \
yast2 \
yast2-ruby-bindings"

inherit rpm
