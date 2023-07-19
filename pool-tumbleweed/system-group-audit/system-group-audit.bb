SUMMARY = "System group 'audit'"
DESCRIPTION = "This package contains the system group 'audit' for read access to logs."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.1"

RPM_NAME = "system-group-audit-3.1.1-1.1.aarch64.rpm"
RPM_HASH = "39edf26a85ed776c263587457c35d1bb365272c4c50ce7d796f2981b66a01af83f0c7cf855f106022004245eb7583a94d82ca67025914666ee11c6345ffa35e2"

RPROVIDES:${PN} += "group-audit \
system-group-audit"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
