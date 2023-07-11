SUMMARY = "Script to apply network provided settings"
DESCRIPTION = "This package provides the netconfig scripts to apply network \
provided settings like DNS or NIS into system files."
LICENSE = "GPL-2.0-or-later"

PV = "0.90.0"

RPM_NAME = "sysconfig-netconfig-0.90.0-3.3.aarch64.rpm"
RPM_HASH = "a23ddca31b42484958ca40abb58789b921b953472a66ad81c56cd0ef13c7cf554cd829bb9e2370f58f686397b392784817760b64088efe69c02723c1ecd166ce"

RPROVIDES:${PN} += "/sbin/netconfig \
config-sysconfig-netconfig \
sysconfig-netconfig"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/gawk \
/usr/bin/logger \
sysconfig"

inherit rpm
